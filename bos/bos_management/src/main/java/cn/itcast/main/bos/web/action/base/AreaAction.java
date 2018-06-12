package cn.itcast.main.bos.web.action.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;

import cn.itcast.bos.domain.base.Area;
import cn.itcast.bos.service.base.AreaService;
import cn.itcast.bos.utils.PinYin4jUtils;
import cn.itcast.main.bos.web.action.common.BaseAction;

@ParentPackage("json-default")
@Namespace("/")
@Controller
@Scope("prototype")
public class AreaAction extends BaseAction<Area> {
	private Area area = new Area();

	public void setArea(Area area) {
		this.area = area;
	}

	@Autowired
	private AreaService areaService;

	private File file;

	public void setFile(File file) {
		this.file = file;
	}

	// 批量数据导入
	@Action(value = "area_batchImport")
	public String batchImport() {
		try {
			List<Area> list = new ArrayList<Area>();
			// System.out.println(file);
			// 基于.xls 格式解析HSSF
			// 加载Excel文件对象
			HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(file));
			// 读取一个sheet
			HSSFSheet sheet = workbook.getSheetAt(0);
			// 读取sheet中的每一行
			for (Row row : sheet) {
				// 一行数据对应一个区域对象
				if (row.getRowNum() == 0) {
					// 跳过第一行
					continue;
				}
				// 跳过空行
				if (row.getCell(0) == null
						|| StringUtils.isBlank(row.getCell(0)
								.getStringCellValue())) {
					continue;
				}
				Area area = new Area();
				area.setId(row.getCell(0).getStringCellValue());
				area.setProvince(row.getCell(1).getStringCellValue());
				area.setCity(row.getCell(2).getStringCellValue());
				area.setDistrict(row.getCell(3).getStringCellValue());
				area.setPostcode(row.getCell(4).getStringCellValue());

				// 基于piny4j生成城市的编码和简码
				String province = area.getProvince();
				String city = area.getCity();
				String district = area.getDistrict();

				province = province.substring(0, province.length() - 1);
				city = city.substring(0, city.length() - 1);
				district = district.substring(0, district.length() - 1);

				// 简码
				String[] headArray = PinYin4jUtils.getHeadByString(province
						+ city + district);
				StringBuffer sb = new StringBuffer();

				for (String handStr : headArray) {
					sb.append(handStr);
				}

				String str = sb.toString();

				area.setShortcode(str);

				// 城市编码
				String cityCode = PinYin4jUtils.hanziToPinyin(city, "");
				area.setCitycode(cityCode);

				list.add(area);
			}
			areaService.saveBatch(list);

			return NONE;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Action(value = "save_pageQuery", results = { @Result(name = "success", type = "json") })
	public String pageQuery() {
		Pageable pageable = new PageRequest(page - 1, rows);

		Specification<Area> specification = new Specification<Area>() {

			@Override
			public Predicate toPredicate(Root<Area> root,
					CriteriaQuery<?> query, CriteriaBuilder cb) {

				List<Predicate> list = new ArrayList<Predicate>();

				if (StringUtils.isNotBlank(area.getProvince())) {
					// 根据省份查询 模糊查询
					Predicate p1 = cb.like(root.get("province")
							.as(String.class), "%" + area.getProvince() + "%");
					list.add(p1);
				}
				if (StringUtils.isNotBlank(area.getCity())) {
					// 根据城市查询 模糊查询
					Predicate p2 = cb.like(root.get("city").as(String.class),
							"%" + area.getCity() + "%");
					list.add(p2);

				}
				if (StringUtils.isNotBlank(area.getDistrict())) {
					// 根据地区查询 模糊查询
					Predicate p3 = cb.like(root.get("district")
							.as(String.class), "%" + area.getDistrict() + "%");
					list.add(p3);
				}
				return cb.and(list.toArray(new Predicate[0]));
			}
		};

		// 调用业务层
		Page<Area> pageData = areaService.findPageData(specification, pageable);

		pushPageDataToValueStack(pageData);
		return SUCCESS;
	}

}

package cn.itcast.main.bos.web.action.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang.StringUtils;
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

import cn.itcast.bos.domain.base.Courier;
import cn.itcast.bos.service.base.CourierService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@ParentPackage("json-default")
@Namespace("/")
@Controller
@Scope("prototype")
public class CourierAction extends ActionSupport implements
		ModelDriven<Courier> {
	private Courier courier = new Courier();

	@Override
	public Courier getModel() {
		return courier;
	}

	@Autowired
	private CourierService courierService;

	@Action(value = "courier_save", results = { @Result(name = "success", location = "./pages/base/courier.html", type = "redirect") })
	public String save() {
		courierService.save(courier);
		return SUCCESS;
	}

	// 属性驱动
	private int page;
	private int rows;

	public void setPage(int page) {
		this.page = page;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	@Action(value = "courier_pageQuary", results = { @Result(name = "success", type = "json") })
	public String pageQuery() {
		Pageable pageable = new PageRequest(page - 1, rows);

		Specification<Courier> sperification = new Specification<Courier>() {

			@Override
			public Predicate toPredicate(Root<Courier> root,
					CriteriaQuery<?> query, CriteriaBuilder cb) {
				// 当前查询Root根对象Courier
				List<Predicate> list = new ArrayList<Predicate>();
				// 单表查询（查询当前对象 对应 数据表）
				if (StringUtils.isNotBlank(courier.getCourierNum())) {
					Predicate p1 = cb.equal(
							root.get("courierNum").as(String.class),
							courier.getCourierNum());
					list.add(p1);
				}
				if (StringUtils.isNotBlank(courier.getCompany())) {
					Predicate p2 = cb.like(
							root.get("company").as(String.class),
							"%" + courier.getCompany() + "%");
					System.out.println(p2);
					list.add(p2);
				}
				if (StringUtils.isNotBlank(courier.getType())) {
					Predicate p3 = cb.equal(root.get("type").as(String.class),
							courier.getType());
					System.out.println(p3);
					list.add(p3);
				}

				// 多表查询 （查询当前对象 关联 对象 对应的数据表）
				// 使用Courier（Root） 关联Standard
				Join<Object, Object> join = root.join("standard",
						JoinType.INNER);
				if (courier.getStandard() != null
						&& StringUtils.isNotBlank(courier.getStandard()
								.getName())) {
					// 进行 收费标准 名称进行模糊查询
					Predicate p4 = cb.like(join.get("name").as(String.class),
							"%" + courier.getStandard().getName() + "%");
					list.add(p4);
				}
				return cb.and(list.toArray(new Predicate[0]));
			}
		};

		Page<Courier> pageData = courierService.findPageData(sperification,
				pageable);

		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", pageData.getTotalElements());
		result.put("rows", pageData.getContent());

		// 转成json转发
		ActionContext.getContext().getValueStack().push(result);

		return SUCCESS;
	}

	private String ids;

	public void setIds(String ids) {
		this.ids = ids;
	}

	// 批量逻辑删除
	@Action(value = "courier_delBatch", results = { @Result(name = "success", location = "./pages/base/courier.html", type = "redirect") })
	public String delBatch() {
		// 按id分
		System.out.println(ids);
		String[] s = ids.split(",");

		courierService.delBatch(s);

		return SUCCESS;
	}

}

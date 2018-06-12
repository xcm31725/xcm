package cn.itcast.main.bos.web.action.base;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;

import cn.itcast.bos.domain.base.Standard;
import cn.itcast.bos.service.base.StandardService;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@ParentPackage("struts-default")
// @ParentPackage("json-default")
@Namespace("/")
@Controller
@Scope("prototype")
public class StandardAction extends ActionSupport implements
		ModelDriven<Standard> {
	private Standard standard = new Standard();

	@Override
	public Standard getModel() {
		return standard;
	}

	@Autowired
	private StandardService standardService;

	@Action(value = "standard_save", results = { @Result(name = "success", type = "redirect", location = "./pages/base/standard.html") })
	public String save() {
		System.out.println("添加收派标准...");
		standardService.save(standard);
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

	// 分页列表查询
	@Action(value = "standard_pageQuery", results = { @Result(name = "success", type = "redirect", location = "./pages/base/standard.html") })
	// @Action(value="standard_pageQuery", results={@Result(name="success",
	// type="json")})
	public void pageQuery() {
		// 调用业务层，查询数据结果
		Pageable pageable = new PageRequest(page - 1, rows);
		Page<Standard> pageData = standardService.findPageData(pageable);

		// 返回客户端数据 需要total 和rows
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("total", pageData.getTotalElements());
		result.put("rows", pageData.getContent());

		// 将map转换成json数据返回，
		String s = JSON.toJSONString(result);
		// JSONObject jsonObject = JSONObject.parseObject(s);
		// JSONArray jsona = JSONArray.parseArray(s);
		// System.out.println(jsonObject);

		// ActionContext.getContext().getValueStack().push(jsonObject);
		try {
			ServletActionContext.getResponse().setCharacterEncoding("utf-8");
			ServletActionContext.getResponse().getWriter().write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// System.out.println(result);
		// ActionContext.getContext().getValueStack().push(result);

		// return SUCCESS;
	}

	// 查询所有收派标准方法
	@Action(value = "standard_findAll", results = { @Result(name = "success", type = "redirect", location = "./pages/base/standard.html") })
	public void findAll() {
		List<Standard> standards = standardService.findAll();
		String s = JSON.toJSONString(standards);
		try {
			ServletActionContext.getResponse().setCharacterEncoding("utf-8");
			ServletActionContext.getResponse().getWriter().write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

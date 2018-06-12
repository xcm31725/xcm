package cn.itcast.main.bos.web.action.transit;

import java.util.HashMap;
import java.util.Map;

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

import com.opensymphony.xwork2.ActionContext;

import cn.itcast.bos.domain.transit.TransitInfo;
import cn.itcast.main.bos.service.transit.TransitInfoService;
import cn.itcast.main.bos.web.action.common.BaseAction;

@ParentPackage("json-default")
@Namespace("/")
@Controller
@Scope("prototype")
public class TransitInfoAction extends BaseAction<TransitInfo> {

	@Autowired
	private TransitInfoService transitInfoService;
	
	private String wayBillIds;
	
	public void setWayBillIds(String wayBillIds) {
		this.wayBillIds = wayBillIds;
	}

	@Action(value="transit_create", results={@Result(name="success", type="json")})
	public String create() {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			transitInfoService.createTransit(wayBillIds);
			result.put("success", true);
			result.put("msg", "开启中转配送成功");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", false);
			result.put("msg", "开启中专失败，错误信息：" + e.getMessage());
		}
		ActionContext.getContext().getValueStack().push(result);
		
		return SUCCESS;
	}
	
	@Action(value="transit_pageQuery", results={@Result(name="success", type="json")})
	public String pageQuery() {
		Pageable pageable = new PageRequest(page - 1, rows);
		Page<TransitInfo> pageData = transitInfoService.findPageData(pageable);
		
		pushPageDataToValueStack(pageData);
		
		return SUCCESS;
	}
}

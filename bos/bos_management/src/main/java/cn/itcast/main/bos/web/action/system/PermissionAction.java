package cn.itcast.main.bos.web.action.system;

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

import com.opensymphony.xwork2.ActionContext;

import cn.itcast.bos.domain.system.Permission;
import cn.itcast.bos.service.system.PermissionService;
import cn.itcast.main.bos.web.action.common.BaseAction;

@ParentPackage("json-default")
@Namespace("/")
@Controller
@Scope("prototype")
public class PermissionAction extends BaseAction<Permission> {

	@Autowired
	private PermissionService permissionService;
	
	@Action(value="permission_list", results={@Result(name="success", type="json")})
	public String list() throws Exception {
//		Pageable pageable = new PageRequest(page - 1, rows);
//		
//		Page<Permission> pageData = permissionService.findPageData(pageable);
//		
//		Map<String, Object> result = new HashMap<String, Object>();
//		result.put("total", pageData.getTotalElements());
//		result.put("rows", pageData.getContent());
//		
//		pushPageDataToValueStack(pageData);
		
		List<Permission> permission = permissionService.findAll();
		
		ActionContext.getContext().getValueStack().push(permission);
		return SUCCESS;
	}
	
	@Action(value="permission_save", results={@Result(name="success",type="json")})
	public String save() {
		permissionService.save(model);
		
		return SUCCESS;
	}
}

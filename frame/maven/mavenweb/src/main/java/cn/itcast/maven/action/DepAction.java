package cn.itcast.maven.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import cn.itcast.maven.domain.Dep;
import cn.itcast.maven.service.IDepService;

public class DepAction {
	private IDepService depService;
	
	public void setDepService(IDepService depService) {
		this.depService = depService;
	}

	public String list() {
		
		List<Dep> list = depService.getList();
		ServletActionContext.getRequest().setAttribute("list", list);
		return "list";
	}
	
}


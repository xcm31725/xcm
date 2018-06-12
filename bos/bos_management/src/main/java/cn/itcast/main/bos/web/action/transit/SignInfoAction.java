package cn.itcast.main.bos.web.action.transit;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.bos.domain.transit.SignInfo;
import cn.itcast.main.bos.service.transit.DeliveryInfoService;
import cn.itcast.main.bos.service.transit.SignInfoService;
import cn.itcast.main.bos.web.action.common.BaseAction;

@ParentPackage("json-default")
@Namespace("/")
@Controller
@Scope("prototype")
public class SignInfoAction extends BaseAction<SignInfo> {

	@Autowired
	private SignInfoService signInfoService;
	
	private String transitInfoId;

	public void setTransitInfoId(String transitInfoId) {
		this.transitInfoId = transitInfoId;
	}
	
	@Action(value="sign_save", results={@Result(name="success", type="redirect", location="pages/tranist/transitinfo.html")})
	public String save() {
		signInfoService.save(transitInfoId, model);
		return SUCCESS;
	}
}

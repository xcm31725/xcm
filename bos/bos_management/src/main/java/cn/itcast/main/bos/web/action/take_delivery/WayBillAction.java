package cn.itcast.main.bos.web.action.take_delivery;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.itcast.bos.domain.take_delivery.WayBill;
import cn.itcast.main.bos.service.take_delivery.WayBillService;
import cn.itcast.main.bos.web.action.common.BaseAction;

@ParentPackage("json-default")
@Namespace("/")
@Controller
@Scope("prototype")
public class WayBillAction extends BaseAction<WayBill>{
	private static final Logger LOGGER = Logger.getLogger(WayBillAction.class);
	
	@Autowired
	private WayBillService wayBillService;
	
	@Action(value="waybill_save", results={@Result(name="success",type="json")})
	public String save() {
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			//去除 没有id的order对象
			if(model.getOrder() != null && (model.getOrder().getId() == null || model.getOrder().getId() == 0)) {
				model.setOrder(null);
			}
			wayBillService.save(model);
			//保存成功
			result.put("successful", true);
			result.put("msg", "保存订单成功！");
			
			LOGGER.info("保存运单成功，运单号：" + model.getWayBillNum());
		} catch (Exception e) {
			e.printStackTrace();
			//保存失败
			result.put("successful", false);
			result.put("msg", "保存运单失败！");
			
			LOGGER.error("保存运单失败，运单号：" + model.getWayBillNum(), e);
		}
		ActionContext.getContext().getValueStack().push(result);
		return SUCCESS;
	}
	
	@Action(value="waybill_pageQuery", results={@Result(name="success", type="json")})
	public String pageQuery() {
		Pageable pagebale = new PageRequest(page - 1, rows, Direction.DESC, "id");
		
		Page<WayBill> pageData = wayBillService.findPageData(model, pagebale);
		
		pushPageDataToValueStack(pageData);
		
		return SUCCESS;
	}
	
	@Action(value="waybill_findByWayBillNum", results={@Result(name="success", type="json")})
	public String findByWayBillNum() {
		WayBill wayBill = wayBillService.findByWayBillNum(model.getWayBillNum());
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		if(wayBill == null) {
			//运单不存在
			result.put("success", true);
		} else {
			//运单存在
			result.put("success", false);
			result.put("wayBillData", wayBill);
		}
		
		ActionContext.getContext().getValueStack().push(result);
		
		return SUCCESS;
	}
}

package cn.itcast.main.bos.web.action.report;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFShape;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.bos.domain.take_delivery.WayBill;
import cn.itcast.main.bos.service.take_delivery.WayBillService;
import cn.itcast.main.bos.web.action.common.BaseAction;

@ParentPackage("json-default")
@Namespace("/")
@Controller
@Scope("prototype")
public class ReportAction extends BaseAction<WayBill> {

	@Autowired
	private WayBillService wayBillService;
	
	@Action("report_exportXls")
	public String exportXls() {
		//查询 前满足出当条件 结果数据
		List<WayBill> wayBill = wayBillService.findWayBills(model);
		
		//生成Excel文件
		HSSFWorkbook hssworkbook = new HSSFWorkbook();
		HSSFShape hssf
		
		return NONE;
	}
}

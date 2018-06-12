package cn.itcast.main.bos.web.action.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang.StringUtils;
import org.apache.cxf.jaxrs.client.WebClient;
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

import cn.itcast.bos.domain.base.FixedArea;
import cn.itcast.bos.service.base.FixedAreaService;
import cn.itcast.crm.domain.Customer;
import cn.itcast.main.bos.web.action.common.BaseAction;

import com.opensymphony.xwork2.ActionContext;

@ParentPackage("json-default")
@Namespace("/")
@Controller
@Scope("prototype")
public class FixedAreaAction extends BaseAction<FixedArea> {

	@Autowired
	private FixedAreaService fixedAreaService;

	@Action(value = "save_fixedArea", results = { @Result(name = "success", location = "./pages/base/fixed_area.html", type = "redirect") })
	public String save() {
		fixedAreaService.save(model);
		return SUCCESS;
	}

	@Action(value = "fixedArea_pageQuery", results = { @Result(name = "success", type = "json") })
	public String pageQuery() {
		Pageable pageable = new PageRequest(page - 1, rows);

		Specification<FixedArea> specification = new Specification<FixedArea>() {

			@Override
			public Predicate toPredicate(Root<FixedArea> root,
					CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();

				if (StringUtils.isNotBlank(model.getId())) {
					// 根据定去编号查询 等值查询
					Predicate p1 = cb.equal(root.get("id").as(String.class),
							model.getId());
					list.add(p1);
				}
				if (StringUtils.isNotBlank(model.getCompany())) {
					// 根据公司查询 模糊
					Predicate p2 = cb.equal(root.get("company")
							.as(String.class), model.getCompany());
					list.add(p2);
				}
				return cb.and(list.toArray(new Predicate[0]));
			}
		};

		Page<FixedArea> pageData = fixedAreaService.fingPageData(specification,
				pageable);

		pushPageDataToValueStack(pageData);

		return SUCCESS;
	}

	// 查询未关联的定区列表
	@Action(value = "fixedArea_findOntRelevanceCustomer", results = { @Result(name = "success", type = "json") })
	public String findOntRelevanceCustomer() {
		// 使用webClient调用webService接口
		Collection<? extends Customer> collection = WebClient
				.create("http://localhost:8088/crm_management/services/customerService/ontRelevanceCustomer")
				.accept(MediaType.APPLICATION_JSON)
				.getCollection(Customer.class);
		System.out.println(collection.toString());
		ActionContext.getContext().getValueStack().push(collection);
		return SUCCESS;
	}

	// 查询已关联的定区列表
	@Action(value = "fixedArea_findRelevenceCustomer", results = { @Result(name = "success", type = "json") })
	public String findRelevanceCustomer() {
		// 使用webClient调用webService接口
		Collection<? extends Customer> collection = WebClient
				.create("http://localhost:8088/crm_management/services/customerService/relevenceCustomer/"
						+ model.getId()).accept(MediaType.APPLICATION_JSON)
				.type(MediaType.APPLICATION_JSON).getCollection(Customer.class);
		System.out.println(collection.toString());
		ActionContext.getContext().getValueStack().push(collection);
		return SUCCESS;
	}

	// 属性驱动
	private String[] customerIds;

	public void setCustomerIds(String[] customerIds) {
		this.customerIds = customerIds;
	}

	// 关联客户到定区
	@Action(value = "fixedArea_bindingCustomerFixedArea", results = { @Result(name = "success", type = "redirect", location = "./pages/base/fixed_area.html") })
	public String bindingCustomerFixedArea() {
		String customerStr = StringUtils.join(customerIds, ",");
		WebClient.create(
				"http://localhost:8088/crm_management/services/customerService"
						+ "/customerFixedArea?customerIdStr=" + customerStr
						+ "&fixedAreaId=" + model.getId()).put(null);
		return SUCCESS;
	}

}

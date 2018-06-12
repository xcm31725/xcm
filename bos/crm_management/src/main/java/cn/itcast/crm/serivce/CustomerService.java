package cn.itcast.crm.serivce;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import cn.itcast.crm.domain.Customer;

public interface CustomerService {
	//查询未关联客户列表
	@Path("/ontRelevanceCustomer")
	@GET
	@Produces({"application/xml","application/json"})
	public List<Customer> findOntRelevanceCustomer();
	
	//查询该定区已关联客户列表
	@Path("/relevenceCustomer/{fixedareaid}")
	@GET
	@Produces({"application/xml","application/json"})
	public List<Customer> findRelevenceCustomer(@PathParam("fixedareaid") String fixedAreaid);
	
	//绑定客户到定区操作
	@Path("/customerFixedArea")
	@PUT
	public void bindingCustomerFixedArea(@QueryParam("customerIdStr") String customerIdStr, @QueryParam("fixedAreaId") String fixedAreaId);
	
	@Path("/customer")
	@PUT
	@Consumes({"application/xml","application/json"})
	public void regist(Customer customer);
	
	@Path("/customer/telephone/{telephone}")
	@GET
	@Consumes({"application/xml","application/json"})
	public Customer findByTelephone(@PathParam("telephone") String telephone);
	
	@Path("/customer/updateType/{telephone}")
	@GET
	public void updateType(@PathParam("telephone") String telephone);

	//登录页面
	@Path("/customer/login")
	@GET
	@Consumes({"application/xml","application/json"})
	@Produces({"application/xml","application/json"})
	public Customer login(@QueryParam("telephone") String telephone, @QueryParam("password") String password);
	
}

package cn.itcast.crm.serivce.impl;

import java.util.List;

import javax.ws.rs.Path;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.crm.dao.CustomerRepository;
import cn.itcast.crm.domain.Customer;
import cn.itcast.crm.serivce.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> findOntRelevanceCustomer() {
		
		return customerRepository.findByFixedAreaIdIsNull();
	}

	@Override
	public List<Customer> findRelevenceCustomer(String fixedAreaid) {
		return customerRepository.findByFixedAreaId(fixedAreaid);
	}

	@Override
	public void bindingCustomerFixedArea(String customerIdStr,String fixedAreaId) {
		//解除关联动作
		customerRepository.clearFixedAreaId(fixedAreaId);
		
		//切割字符串 1,2,3
		if(StringUtils.isBlank(customerIdStr) || customerIdStr == "null") {
			return;
		}
		
		String[] idStr = customerIdStr.split(",");
		for (String string : idStr) {
			Integer id = Integer.parseInt(string);
			customerRepository.updateFixedAreaId(fixedAreaId,id);
		}
		
	}

	@Override
	public void regist(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public Customer findByTelephone(String telephone) {
		return customerRepository.findByTelephone(telephone);
	}

	@Override
	public void updateType(String telephone) {
		customerRepository.updateTyep(telephone);
	}

	
	@Override
	public Customer login(String telephone, String password) {
		return customerRepository.findByTelephoneAndPassword(telephone, password);
	}
}

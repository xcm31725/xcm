package cn.itcast.crm.serivce;

import static org.junit.Assert.*;

import org.apache.cxf.jaxrs.spring.JAXRSServerFactoryBeanDefinitionParser.SpringJAXRSServerFactoryBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.crm.serivce.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class CustomerServiceTest {
	
	@Autowired
	private CustomerService customerService;
	
	@Test
	public void testFindOntRelevanceCustomer() {
		System.out.println(customerService.findOntRelevanceCustomer());
	}

	@Test
	public void testFindRelevenceCustomer() {
		System.out.println(customerService.findRelevenceCustomer("1"));
	}

	@Test
	public void testBindingCustomerFixedArea() {
		customerService.bindingCustomerFixedArea("1,2", "1");
	}

}

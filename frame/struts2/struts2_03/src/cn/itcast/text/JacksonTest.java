package cn.itcast.text;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ser.FilterProvider;
import org.codehaus.jackson.map.ser.impl.SimpleBeanPropertyFilter;
import org.codehaus.jackson.map.ser.impl.SimpleFilterProvider;
import org.junit.Test;

import cn.itcast.domain.Product;

public class JacksonTest {
	@Test
	public void test1() throws Exception {
		Product p = new Product();
		p.setId(1);
		p.setName("笔记本");
		p.setPrice(4999);
		p.setBirthday(new Date());
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));//设置时间格式
		String j = mapper.writeValueAsString(p);
		System.out.println(j);
	}
	
	@Test
	public void test2() throws Exception {
		Product p = new Product();	
		p.setId(1);
		p.setName("笔记本");
		p.setPrice(4999);

		Product p1 = new Product();
		p1.setId(2);
		p1.setName("手机");
		p1.setPrice(2999);
		
		List<Product> list = new ArrayList<Product>();
		list.add(p);
		list.add(p1);
		
		ObjectMapper m = new ObjectMapper();
		//处理过滤属性
		//FilterProvider fp = new SimpleFilterProvider().addFilter("pf", SimpleBeanPropertyFilter.serializeAllExcept("id","name"));//不包含id和name
		FilterProvider fp = new SimpleFilterProvider().addFilter("pf", SimpleBeanPropertyFilter.filterOutAllExcept("id","name"));//只包含id和name
		
		m.setFilters(fp);
		String js = m.writeValueAsString(list);
		
		System.out.println(js);
		
		
	}
}

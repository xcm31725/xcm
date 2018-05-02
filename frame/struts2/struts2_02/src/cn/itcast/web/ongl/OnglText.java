package cn.itcast.web.ongl;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OnglText {
	
	//表达式     OgnlContext 上下文   root 根
	@Test
	public void test1() throws OgnlException {
		
		//1.获得上下文对象
		OgnlContext context = new OgnlContext();//他是一个java.util.map
		
		//操作
		Object root = context.getRoot();
		Object value = Ognl.getValue("'hello'.length()", context, root);
		
		System.out.println(value);
	}
	
	@Test
	public void test2() throws OgnlException {
		OgnlContext context = new OgnlContext();
		
		Object value = Ognl.getValue("@java.lang.Math@random()", context, context.getRoot());
		Object value2 = Ognl.getValue("@java.lang.Math@PI", context, context.getRoot());
		
		System.out.println(value);
		System.out.println(value2);
	}
	

	@Test
	public void test3() throws Exception {
		OgnlContext context = new OgnlContext();
		
		context.put("username", "xcm");
		
		Object value = Ognl.getValue("#username", context, context.getRoot());
		System.out.println(value);
	}
	
	@Test
	public void test4() throws Exception {
		OgnlContext context = new OgnlContext();
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("username", "xgd");
		//把map中的值存进context中
		context.setRoot(map);
		
		context.put("username", "xcm");
		
		Object value = Ognl.getValue("#username", context, context.getRoot());
		System.out.println(value);
	  }
	
	//创建集合
	@Test
	public void test5() throws OgnlException {
		OgnlContext context = new OgnlContext();
		
		//Object value = Ognl.getValue("{1,2,3,4,5}", context, context.getRoot());
		Object value = Ognl.getValue("{'xcm','xgd','zc','sd','tx'}", context, context.getRoot());
		System.out.println(value.getClass());
		
		context.setRoot(value);
		Object value1 = Ognl.getValue("[2]", context, context.getRoot());
		System.out.println(value1);

		Object value2 = Ognl.getValue("#{'username':'tom','age':18}", context, context.getRoot());
		System.out.println(value2.getClass());
	}
	
	//创建集合
	@Test
	public void test6() throws OgnlException {
		OgnlContext context = new OgnlContext();

		Object value = Ognl.getValue("#{'username':'tom','age':18}", context, context.getRoot());
		System.out.println(value.getClass());
		
		context.setRoot(value);
		Object value1 = Ognl.getValue("username='xcm',age=19", context, context.getRoot());
		System.out.println(value1);
	}
}

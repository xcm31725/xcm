package cn.itcast.cglb;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglbProxyFactory implements MethodInterceptor{
	private Object ter;
	
	public CglbProxyFactory(Object ter) {
		this.ter = ter;
	}
	
	public Object createProxy() {
		//创建Enhancer
		Enhancer e = new Enhancer();
		
		//传递目标对象的class
		e.setSuperclass(ter.getClass());
		
		//设置回调操作
		e.setCallback(this);
		
		return e.create();

	}

	@Override
	public Object intercept(Object proxy, Method method, Object[] arg2, MethodProxy methodProxy) throws Throwable {
		System.out.println("日志记录。。。。。。");
		return method.invoke(ter, arg2);
	}
	
}

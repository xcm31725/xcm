package cn.itcast.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//创建一个JDK的Proxy完成的动态代理工具
public class JDKProxyFactory implements InvocationHandler{
	private Object tal;
	
	public JDKProxyFactory(Object tal) {
		this.tal = tal;
	}
	
	public Object createProxy() {
		
		//获得 tal.getClass().getClassLoader()的类加载器
		ClassLoader loader = tal.getClass().getClassLoader();
		
		//得到目标对象的实现接口的Class[]
		Class[] interfaces  = tal.getClass().getInterfaces();
		
		//参数三需要一个实现了InvocationHandler接口对象
		return Proxy.newProxyInstance(loader, interfaces, this);
		
	}

	//参数一代理对象，一般 不适用
	//参数二它的调用方法的Method对象
	//调用方法的对象
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//功能增强
		System.out.println("日志操作。。。。。。");
		
		return method.invoke(tal, args);
	}
}

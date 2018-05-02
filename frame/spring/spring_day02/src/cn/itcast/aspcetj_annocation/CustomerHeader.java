package cn.itcast.aspcetj_annocation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component //通知
@Aspect //声明当前的bean是一个切面
public class CustomerHeader {
	
	@Pointcut("execution(* *.s*(..))")
	private void myPoincut() {
	}
	@Pointcut("execution(* *.u*(..))")
	private void myPoincut1() {
	}
	
	//前置通知
	@Before("myPoincut()||myPoincut1()")
	public void before() {
		System.out.println("前置通知...");
	}
	
	//后置通知
	@AfterReturning(value="execution(* *.update(..))", returning="val")
	public void afterReturning(JoinPoint jp, Object val) {
		System.out.println("后置通知，目标方法的返回值：" + val);
	} 
	
	//环绕通知
	@Around("myPoincut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕前......");
		Object obj = pjp.proceed();
		System.out.println("环绕后......");
		return obj;
	}
	
	//异常抛出通知
	@AfterThrowing(value="myPoincut()", throwing="ex")
	public void afterThrowing(JoinPoint jp, Object ex) {
		System.out.println("异常抛出通知：" + ex);
	}
	
	//最终通知
	@After("myPoincut()")
	public void after() {
		System.out.println("最终通知");
	}
}

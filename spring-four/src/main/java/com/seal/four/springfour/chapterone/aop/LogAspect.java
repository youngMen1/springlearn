package com.seal.four.springfour.chapterone.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:54
 * @description 切面
 **/
@Aspect
@Component
public class LogAspect {

	@Pointcut("@annotation(com.seal.four.springfour.chapterone.aop.Action)")
	public void annotationPointCut(){
		
	}

	@After("annotationPointCut()")
	public void after(JoinPoint joinpoint){
		MethodSignature signature = (MethodSignature) joinpoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截 " + action.name());
	}

	@Before("execution(* com.seal.four.springfour.chapterone.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则拦截," + method.getName());
	}
}

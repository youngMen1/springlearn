package com.seal.four.springfour.chapterone.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:54
 * @description
 **/
public class Test1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
		DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
		demoAnnotationService.add();
		demoMethodService.add();
		context.close();
	}
}

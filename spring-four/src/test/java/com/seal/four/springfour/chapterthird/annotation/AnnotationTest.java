package com.seal.four.springfour.chapterthird.annotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		DemoService service = context.getBean(DemoService.class);
		service.outputResult();
		context.close();
	}
}

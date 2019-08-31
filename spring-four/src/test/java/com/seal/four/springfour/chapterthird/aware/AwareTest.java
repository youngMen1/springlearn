package com.seal.four.springfour.chapterthird.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
		AwareService awareService = context.getBean(AwareService.class);
		awareService.outputResult();
		context.close();
	}
}

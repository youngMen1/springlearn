package com.seal.four.springfour.chapterthird.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:54
 * @description
 **/
@Configuration
public class TestConfig {
	@Bean
	@Profile("dev")
	public TestBean devTestBean(){
		return new TestBean("from development profile");
	}
	
	@Bean
	@Profile("prod")
	public TestBean prodTestBean(){
		return new TestBean("from production profile");
	}
}

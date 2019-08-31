package com.seal.four.springfour.chapterthird.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:54
 * @description
 **/
@Configuration
public class ConditionConfig {
	
	@Bean
	@Conditional(WindowsConditional.class)
	public ListService commandService(){
		return new WindowsCommandService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	public ListService linuxEmailerService(){
		return new LinuxCommandService();
	}
}

package com.seal.four.springfour.chapterone.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:54
 * @description
 * @EnableAspectJAutoProxy 开启spring对AspectJ代理的支持
 **/
@Configuration
@ComponentScan("com.seal.four.springfour.chapterone.aop")
@EnableAspectJAutoProxy
public class AopConfig {
	
}

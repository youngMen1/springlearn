package com.seal.four.springfour.chapterone.aop;

import org.springframework.stereotype.Service;
/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:54
 * @description
 **/
@Service
public class DemoAnnotationService {
	@Action(name="注解式拦截的 add 方法")
	public void add(){
		
	}
}

package com.seal.four.springfour.chapterthird.annotation;

import org.springframework.stereotype.Service;
/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:54
 * @description
 **/
@Service
public class DemoService {
	public void outputResult(){
		System.out.println("从组合注解配置照样获得的 bean");
	}
}

package com.seal.four.springfour.chaptertwo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/7/31 13:31
 * @description 事件发布
 * 注入 ApplicationContext 用来发布事件
 * 使用 ApplicationContext 的 publishEvent方法来发布
 **/
@Component
public class DemoPublish {

	@Autowired
	ApplicationContext applicationContext;
	
	public void publish(String msg){
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
}

package com.seal.four.springfour.chaptertwo.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/7/31 13:38
 * @description
 **/
public class EventTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublish demoPublish = context.getBean(DemoPublish.class);
        demoPublish.publish("hello application event");
        context.close();
    }
}

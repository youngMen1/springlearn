package com.seal.four.springfour.chaptertwo.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 11:36
 * @description
 **/
public class PrepostTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }
}

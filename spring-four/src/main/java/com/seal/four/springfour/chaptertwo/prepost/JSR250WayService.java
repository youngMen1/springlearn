package com.seal.four.springfour.chaptertwo.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 11:35
 * @description 使用JSR250 形式的 Bean
 **/
public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destory(){
        System.out.println("jsr250-destory-method");
    }
}

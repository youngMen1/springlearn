package com.seal.four.springfour.chaptertwo.prepost;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 11:35
 * @description 使用 @Bean 形式的 bean
 **/
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-mehtod");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy(){
        System.out.println("@Bean-destory-method");
    }
}

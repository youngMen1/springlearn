package com.seal.four.springfour.chaptertwo.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 11:36
 * @description
 **/
@Configuration
@ComponentScan("com.seal.four.springfour.chaptertwo.prepost")
public class PrePostConfig {
    @Bean(initMethod="init",destroyMethod="destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}

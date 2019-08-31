package com.seal.four.springfour.chaptertwo.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:50
 * @description
 **/
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public DemoBean proDemoBean(){
        return new DemoBean("from production profile");
    }

}

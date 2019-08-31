package com.seal.four.springfour.chaptertwo.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:51
 * @description
 **/
public class ProfileTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}

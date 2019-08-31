package com.seal.four.springfour.chaptertwo.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 11:33
 * @description
 **/
public class ScopeTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1与s2是否相等：" + s1.equals(s2));
        System.out.println("p1与p2是否相等：" + p1.equals(p2));

        context.close();
    }
}

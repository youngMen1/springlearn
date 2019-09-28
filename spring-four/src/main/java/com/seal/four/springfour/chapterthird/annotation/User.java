package com.seal.four.springfour.chapterthird.annotation;

import java.lang.annotation.*;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:54
 * @description 用来描述Person权限
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface User {
    Operator.Permissions value() default Operator.Permissions.READ;
}

package com.seal.four.springfour.chapterthird.annotation;

import java.lang.reflect.Field;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/28 09:32
 * @description 测试 User注解
 **/
public class CheckPerson {
    public static void check(String clas) {

        try {
            Class<?> cls = Class.forName(clas);
            Field[] fields = cls.getDeclaredFields();

            for (Field field : fields) {
                if (field.isAnnotationPresent(User.class) == true) {
                    User user = field.getAnnotation(User.class);
                    System.out.println("User Permissions:    " + user.value() + "\nval：   " + user.value().getPermissionsNumber());
                }
                System.out.println();
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        check("com.seal.four.springfour.chapterthird.annotation.Person");
    }
}

package com.seal.four.springfour.chapterthird.annotation;


/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/28 09:29
 * @description
 **/
public class Person {

    @User(Operator.Permissions.NONE)
    private int permissions0;

    @User(Operator.Permissions.READ)
    private int permissions1;

    @User(Operator.Permissions.WRITE)
    private int permissions2;

    @User(Operator.Permissions.MANAGE)
    private int permissions3;

    public int getPermissions0() {
        return permissions0;
    }

    public int getPermissions1() {
        return permissions1;
    }

    public int getPermissions2() {
        return permissions2;
    }

    public int getPermissions3() {
        return permissions3;
    }
}

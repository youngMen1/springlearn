package com.seal.four.springfour.chapterthird.annotation;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/28 09:30
 * @description
 **/
public class Operator {

    public enum Permissions {
        /**
         * 无权限
         */
        NONE(0),
        /**
         * 只读
         */
        READ(1),
        /**
         * 写入
         */
        WRITE(2),
        /**
         * 管理员
         */
        MANAGE(3);

        private int permissionsNumber;

        private Permissions(int permissionsNumber) {
            this.permissionsNumber = permissionsNumber;
        }

        public int getPermissionsNumber() {
            return permissionsNumber;
        }

        public void setPermissionsNumber(int permissionsNumber) {
            this.permissionsNumber = permissionsNumber;
        }
    }
}

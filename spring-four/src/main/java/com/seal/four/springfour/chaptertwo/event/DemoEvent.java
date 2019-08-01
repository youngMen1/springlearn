package com.seal.four.springfour.chaptertwo.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/7/31 13:31
 * @description
 **/
@Data
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
}

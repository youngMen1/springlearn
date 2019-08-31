package com.seal.four.springfour.chaptertwo.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 11:31
 * @description
 **/
@Scope("prototype")
@Service
public class DemoPrototypeService {
}

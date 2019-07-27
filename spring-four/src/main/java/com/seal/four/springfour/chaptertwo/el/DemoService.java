package com.seal.four.springfour.chaptertwo.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/7/27 17:45
 * @description Spring EL 和资源调用
 **/
@Service
public class DemoService {

	@Value("其他类的属性")
	private String another;

	public String getAnother() {
		return another;
	}

	public void setAnother(String another) {
		this.another = another;
	}
	
}

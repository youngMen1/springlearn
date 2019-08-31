package com.seal.four.springfour.chapterthird.conditional;
/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:54
 * @description
 **/
public class WindowsCommandService implements ListService{

	@Override
	public String showListCmd() {
		return "dir";
	}

}

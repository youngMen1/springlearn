package com.seal.four.springfour.chapterthird.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:54
 * @description
 **/
@Service
public class AsyncTaskService {
	
	/**
	 * 通过 @Async 注解表明该方法是个异步方法
	 * @param i
	 */
	@Async
	public void executeAsyncTask(Integer i){
		System.out.println("执行异步任务：" + i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i){
		System.out.println("执行异步任务+1：" + i);
	}
}

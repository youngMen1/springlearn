package com.seal.four.springfour.chapterthird.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:54
 * @description
 * @EnableAsync 利用 @EnableAsync 注解开启异步任务支持
 **/
@Configuration
@ComponentScan("com.seal.four.springfour.chapterthird.taskexecutor")
@EnableAsync // 利用 @EnableAsync 注解开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer{

	/**
	 * 实现 AsyncConfigurer 接口并重写 getAsyncExecutor 方法，并返回一个 ThreadPoolTaskExecutor,
	 * 这样我们就获得了一个基于线程池 TaskExecutor
	 * @return
	 */
	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);
		taskExecutor.setMaxPoolSize(20);
		taskExecutor.setQueueCapacity(25);
		taskExecutor.initialize();
		return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}
	
}

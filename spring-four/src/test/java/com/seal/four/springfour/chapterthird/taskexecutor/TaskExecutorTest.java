package com.seal.four.springfour.chapterthird.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskExecutorTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService service = context.getBean(AsyncTaskService.class);
		for (int i = 0; i < 10; i++) {
			service.executeAsyncTask(i);
			service.executeAsyncTaskPlus(i);
		}
		context.close();
	}
}

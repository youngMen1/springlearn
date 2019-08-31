package com.seal.four.springfour.chapterthird.taskschduler;

import com.seal.four.springfour.chapterthird.taskscheduler.TaskschedulerConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskSchedulerTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskschedulerConfig.class);
		context.close();
	}
}

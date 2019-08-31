package com.seal.four.springfour.chapterthird.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:54
 * @description
 **/
@Service
public class TaskschedulerService {
	
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate=5000)
	public void reportCurrentTime(){
		System.out.println("每隔5秒执行一次：" + DATE_FORMAT.format(new Date()));
	}
	
	@Scheduled(cron="0 34 10 ? * *")
	public void fixTimeExecution(){
		System.out.println("在指定时间: " + DATE_FORMAT.format(new Date()) + "执行");
	}
	
}

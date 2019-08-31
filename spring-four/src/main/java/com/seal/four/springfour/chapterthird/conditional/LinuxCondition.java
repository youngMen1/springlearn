package com.seal.four.springfour.chapterthird.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:54
 * @description
 **/
public class LinuxCondition implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return context.getEnvironment().getProperty("os.name").contains("Linux");
	}

}

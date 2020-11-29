package com.gazgeek.helloworld.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		super();
		System.out.println("调用MyBeanPostProcessor构造器！！");

	}

	@Override
	public Object postProcessAfterInitialization(Object beanObject, String beanName)
			throws BeansException {
		if ("userService".equals(beanName)) {
			System.out.println(
					"BeanPostProcessor接口方法postProcessAfterInitialization()对beanObject进行设置,beanName:"
							+ beanName);
		}
		return beanObject;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanObject, String beanName)
			throws BeansException {
		if ("userService".equals(beanName)) {
			System.out.println(
					"BeanPostProcessor接口方法postProcessBeforeInitialization()对beanObject进行设置,beanName:"
							+ beanName);
		}
		return beanObject;
	}
}
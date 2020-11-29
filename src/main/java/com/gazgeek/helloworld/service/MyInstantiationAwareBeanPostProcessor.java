package com.gazgeek.helloworld.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

@Component
public class MyInstantiationAwareBeanPostProcessor
		extends InstantiationAwareBeanPostProcessorAdapter {

	public MyInstantiationAwareBeanPostProcessor() {
		super();
		System.out.println("调用MyInstantiationAwareBeanPostProcessor类构造器！");
	}

	// 接口方法、实例化Bean之前调用
	@Override
	public Object postProcessBeforeInstantiation(Class beanClass, String beanName)
			throws BeansException {
		if ("userService".equals(beanName)) {
			System.out.println(
					"MyInstantiationAwareBeanPostProcessor调用postProcessBeforeInstantiation()方法,beanName:"
							+ beanName);
		}
		return null;
	}

	// 接口方法、实例化Bean之后调用
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		if ("userService".equals(beanName)) {
			System.out.println(
					"MyInstantiationAwareBeanPostProcessor调用postProcessAfterInitialization()方法,beanName:"
							+ beanName);
		}
		return bean;
	}

	// 接口方法、设置某个属性时调用
	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName)
			throws BeansException {
		if ("userService".equals(beanName)) {
			System.out.println(
					"MyInstantiationAwareBeanPostProcessor调用postProcessPropertyValues()方法,beanName:"
							+ beanName);
		}
		return super.postProcessProperties(pvs, bean, beanName);
	}

}
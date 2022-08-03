package com.myspring.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyAnnotationConfigApplicationContext extends AnnotationConfigApplicationContext {

	public MyAnnotationConfigApplicationContext(Class<?>... componentClasses) throws BeansException {
		super(componentClasses);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		beanFactory.addBeanPostProcessor(new MyBeanPostProcessor());
	}
}

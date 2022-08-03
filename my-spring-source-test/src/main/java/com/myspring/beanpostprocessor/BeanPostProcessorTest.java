package com.myspring.beanpostprocessor;

import org.springframework.context.ApplicationContext;

public class BeanPostProcessorTest {
	public static void main(String[] args) {
		ApplicationContext context = new MyAnnotationConfigApplicationContext(Config.class);
		Object person = context.getBean("person");
		System.out.println(person);
	}
}

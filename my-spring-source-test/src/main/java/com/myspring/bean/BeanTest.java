package com.myspring.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Object person = context.getBean("person");
		System.out.println(person);
	}
}

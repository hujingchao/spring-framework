package com.myspring.beanpostprocessor;

import com.myspring.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Description: 自定义BeanPostProcessor
 * date 2022/8/3 16:28
 * @author hu_jch
 * @version 1.0
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization:beanName: " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization:beanName: " + beanName);
		if (bean instanceof Person) {
			Person person = (Person)bean;
			person.setName("postProcessAfterInitialization set name");
		}
		return bean;
	}
}

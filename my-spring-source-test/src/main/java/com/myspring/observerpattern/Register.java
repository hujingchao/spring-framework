package com.myspring.observerpattern;

import com.myspring.beanpostprocessor.Config;
import com.myspring.beanpostprocessor.MyAnnotationConfigApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;

public class Register {

	@Autowired
	private ApplicationEventPublisher eventPublisher;

	public static void main(String[] args) {
		Register bean = new Register();
		bean.register();
	}

	public void register() {
		ApplicationContext context = new MyAnnotationConfigApplicationContext(Config.class);
		eventPublisher.publishEvent(new UserRegisterEvent("hujingchao"));
	}
}

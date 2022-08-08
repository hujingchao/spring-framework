package com.myspring.observerpattern;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserRegisterListener implements ApplicationListener<UserRegisterEvent> {

	@Override
	public void onApplicationEvent(UserRegisterEvent event) {
		System.out.println(event);
		System.out.println("监听到用户注册了");
	}
}

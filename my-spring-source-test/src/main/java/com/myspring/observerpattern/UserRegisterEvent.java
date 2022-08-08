package com.myspring.observerpattern;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * Description:
 * date 2022/8/8 15:51
 * @author hu_jch
 * @version 1.0
 */
@Component
public class UserRegisterEvent extends ApplicationEvent {

	private final String userName;

	public UserRegisterEvent(@Value("hjc") String userName) {
		super(userName);
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}
}

package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

	@Autowired
	BeanFriend beanFriend;
	
	public int doSomething() {
		return beanFriend.getValue()*2;
	}
}

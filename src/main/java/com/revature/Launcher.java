package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.beans.MyBean;


public class Launcher {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.revature");
		MyBean bean = context.getBean(MyBean.class);
		
		// Expected output: 20
		System.out.println(bean.doSomething());
		
	}
}

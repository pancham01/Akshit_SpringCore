package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.model.Employee;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Employee bean = ioc.getBean("emp",Employee.class);
//		System.out.println(bean);
		
		
		Employee bean2 = ioc.getBean("emp2",Employee.class);
		System.out.println(bean2);
	}

}

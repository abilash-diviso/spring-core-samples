package com.diviso.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diviso.domain.Student;

public class UsingInnerBeans {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("usingInnerBeans.xml");
	
		Student student=context.getBean("student",Student.class);
		System.out.println("Student is "+student);
	
	}

}

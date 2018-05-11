package com.diviso.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingContextHierarchy {

	public static void main(String[] args) {
		
		ApplicationContext parent =new ClassPathXmlApplicationContext("parent.xml");
		ApplicationContext child=new ClassPathXmlApplicationContext(new String[] {"child.xml"},parent);
		System.out.println("Parent "+parent.containsBean("parentBean")); 
		System.out.println("Child "+child.containsBean("child"));
		
		}
	
}

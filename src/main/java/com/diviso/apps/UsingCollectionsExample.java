package com.diviso.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diviso.domain.ClassRoom;

public class UsingCollectionsExample {

	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("collectionsExampleConfig.xml");
		
		ClassRoom classRoom=context.getBean("classRoom",ClassRoom.class);
		System.out.println("++++++++++++++++++++++++++++++++"+classRoom);
		
		
	}
}

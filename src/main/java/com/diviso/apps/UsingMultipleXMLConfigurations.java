package com.diviso.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diviso.controller.ProductController;

@ComponentScan
public class UsingMultipleXMLConfigurations {

	
	public static void main(String[] args) {
		
		ApplicationContext container= new ClassPathXmlApplicationContext("app.xml");
		
		ProductController controller=(ProductController)container.getBean("aliasController");
		System.out.println(""+controller.addProduct());
		
	}
}

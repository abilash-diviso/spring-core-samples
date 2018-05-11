package com.diviso.apps;


import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingPropertyEditorMechanismAndValueTags {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("propertyEditorMechanism.xml");
		PropertyPlaceholderConfigurer propertyConfig=context.getBean("mappings",PropertyPlaceholderConfigurer.class);
	
	}
	
	
}

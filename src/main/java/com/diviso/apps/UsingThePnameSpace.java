package com.diviso.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diviso.domain.SampleDataSourceConfig;

public class UsingThePnameSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("PnameSpaceDataSource.xml");
	
		SampleDataSourceConfig config=context.getBean("myDataSource",SampleDataSourceConfig.class);
		
		System.out.println("Driver class name is "+config.getDriverClassName());
		System.out.println("Url is "+config.getUrl() );
		System.out.println("username is "+config.getUsername());
		System.out.println("password is "+config.getPassword());
		System.out.println("timeout is "+config.getTimeout());
		System.out.println("is open is "+config.isOpen());
		
		
		
	}

}

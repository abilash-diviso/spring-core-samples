package com.diviso.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diviso.domain.Foo;

public class UsingConstructorBasedDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			ApplicationContext context=new ClassPathXmlApplicationContext("fooBarBaz.xml");
			Foo foo=context.getBean("foo",Foo.class);
			foo.getStatus();
	}

}

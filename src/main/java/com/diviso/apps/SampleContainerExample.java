package com.diviso.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diviso.domain.Product;

/**
 * Hello world!
 *
 */
public class SampleContainerExample 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext container=new ClassPathXmlApplicationContext("domain.xml");
    	Product product=(Product)container.getBean("product1");
    	System.out.println(product);
    }
}

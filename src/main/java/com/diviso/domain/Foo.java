package com.diviso.domain;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Required;
public class Foo {
	
	public Bar getBar() {
		return bar;
	}
	@Required
	public void setBar(Bar bar) {
		this.bar = bar;
	}
	public Baz getBaz() {
		return baz;
	}
	public void setBaz(Baz baz) {
		this.baz = baz;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private Bar bar;
	private Baz baz;
	private String name;
	private int age;
	private String status;
	
	//@ConstructorProperties({"bar","baz","age","name","status"}) //dont know what
	public Foo(/*Bar bar,*/Baz baz,int age,String name,String status) { //different combinations when using construstor injection to avoid ambuity
		// TODO Auto-generated constructor stub
		this.bar=bar;
		this.baz=baz;
		this.name=name;
		this.age=age;
		this.status=status;
		
	}
	public void getStatus() {
		// TODO Auto-generated method stub
		System.out.println("Foo is instantiated "+"Age is "+age+" name is "+name+" status is "+status);
		bar.getStatus();
		baz.getStatus();
	}

}

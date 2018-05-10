package com.diviso.domain;

public class Tax {
	
	public Tax() {
		// TODO Auto-generated constructor stub
		System.out.println("Tax Created");
	}
	
private String name;
private int rate;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
@Override
public String toString() {
	return "Tax name=" + name + ", rate=" + rate + "";
}
}

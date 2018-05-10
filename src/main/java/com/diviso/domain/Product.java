package com.diviso.domain;

public class Product {
	public Product() {
		// TODO Auto-generated constructor stub
		System.out.println("Product Created");
	}
	private String name;
	@Override
	public String toString() {
		return "Product name=" + name + ", price=" + price + ", tax=" + tax + "";
	}
	private int price;
	 Tax tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Tax getTax() {
		return tax;
	}
	public void setTax(Tax tax) {
		System.out.println("Tax setter in product");
		this.tax = tax;
	}
 
}

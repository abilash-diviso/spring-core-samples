package com.diviso.controller;

import com.diviso.domain.Product;
import com.diviso.service.ProductService;

public class ProductController {

	private ProductService service;
	
	
	public ProductService getService() {
		return service;
	}


	public void setService(ProductService service) {
		this.service = service;
	}


	public Product addProduct() {
		return service.add();
	}
	
	
}

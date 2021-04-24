package com.cg.client;

import java.util.ArrayList;
import java.util.List;

import com.cg.beans.Product;
import com.cg.service.CarService;

public class CarClient {
	
	public static void main(String[] args) {
		List<Product> prodlst = new ArrayList<>(); 
		prodlst.add(new Product(1001,"BMW",5000000));
		prodlst.add(new Product(1001,"TOYOTA",1500000));
		prodlst.add(new Product(1001,"MERCEDES",5500000));
		prodlst.add(new Product(1001,"PORSCHE",7000000));
		prodlst.add(new Product(1001,"FORD",3000000));
		
		CarService carser = new CarService();
		System.out.println(carser.carList(prodlst));
		System.out.println(carser.maxPrice(prodlst));
		System.out.println(carser.maxPrice(prodlst));
	}

}

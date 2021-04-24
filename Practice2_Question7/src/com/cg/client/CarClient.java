package com.cg.client;

import java.util.ArrayList;
import java.util.List;

import com.cg.beans.Product;
import com.cg.info.ProductInfo;


public class CarClient {
	
	public static void main(String[] args) {
		List<Product> prodlst = new ArrayList<>(); 
		prodlst.add(new Product(1001,"BMW",5000000));
		prodlst.add(new Product(1002,"TOYOTA",1500000));
		prodlst.add(new Product(1003,"MERCEDES",5500000));
		prodlst.add(new Product(1004,"PORSCHE",7000000));
		prodlst.add(new Product(1005,"FORD",3000000));
		
		ProductInfo prodinfo = new ProductInfo();
		System.out.println(prodinfo.getProducts(prodlst,3100000 ));
		System.out.println(prodinfo.findAverage(prodlst));
		System.out.println(prodinfo.findProduct(prodlst));
		System.out.println(prodinfo.findProduct(prodlst,1005));
	}

}

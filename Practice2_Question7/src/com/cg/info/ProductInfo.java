package com.cg.info;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import com.cg.beans.Product;

public class ProductInfo {
	
	public String getProducts(List<Product> prodlst,double price) {
		String productName = prodlst.stream().filter(p->p.getPrice()>price)
									.map(p->p.getProdName())
									.collect(Collectors.joining(",","(",")"));
		return productName;	
	}
	public double findAverage(List<Product> prodlst) {
		double prodavg = prodlst.stream().mapToDouble(p->p.getPrice()).average().getAsDouble();
		return prodavg;
	}
	
	public List<Product> findProduct(List<Product> prodlst){
		List<Product> lst = new ArrayList<>();
		double max = prodlst.stream().mapToDouble(p->p.getPrice()).max().getAsDouble();
		lst.add(prodlst.stream().filter(p->p.getPrice()== max).findAny().get());
		return lst;
				
	}
	public Product findProduct(List<Product> prodlst,int pid) {
		Product prod = prodlst.stream().filter(p->p.getProdid()==pid).findFirst().get();
		return prod;
	}

}

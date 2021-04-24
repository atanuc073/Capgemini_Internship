package com.cg.service;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import com.cg.beans.Product;

public class CarService {
	
	public double maxPrice(List<Product> prodlst) {
		OptionalDouble max = prodlst.stream().mapToDouble(p->p.getPrice()).max();
		return max.getAsDouble();
	}
	
	public List<String> carList(List<Product> prodlst){
		List<String> lst = prodlst.stream().filter(p->p.getPrice()>2500000).map(p->p.getProdName()).collect(Collectors.toList());
		return lst;
	}
	
	public double sumPrice(List<Product> prodlst) {
		double sumPrice = prodlst.stream().mapToDouble(p->p.getPrice()).sum();
		return sumPrice;
	}

}

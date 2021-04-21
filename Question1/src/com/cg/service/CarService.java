package com.cg.service;

import java.util.List;
import java.util.stream.Collectors;

import com.cg.beans.Car;

public class CarService {
	
	public double getMaxPrice(List<Car> cars) {
		double maxPrice = cars.stream().mapToDouble(c->c.getPrice()).max().getAsDouble();
		
		return maxPrice;

	}
	public String getCarNames(List<Car> cars) {
		String str = cars.stream().map(c->c.getCarName()).collect(Collectors.joining(",","[","]"));

		return str;
		
	}
	
	public double getSumPrice(List<Car> cars) {
		double sum=cars.stream().mapToDouble(c->c.getPrice()).sum();
		return sum;
		
	}

}

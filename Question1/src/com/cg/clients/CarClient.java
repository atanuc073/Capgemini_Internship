package com.cg.clients;

import java.util.ArrayList;
import java.util.List;

import com.cg.beans.Car;
import com.cg.service.CarService;

public class CarClient {
	
	public static void main(String[] args) {
		List<Car> cars =new ArrayList<>();
		cars.add(new Car(1001,"Ford",700000) );
		cars.add(new Car(1002,"Toyota",1000000));
		cars.add(new Car(1003,"Honda",500000));
		cars.add(new Car(1004,"Tesla",4000000));
		
		CarService ser = new CarService();
		System.out.println(ser.getCarNames(cars));
		System.out.println(ser.getMaxPrice(cars));
		System.out.println(ser.getSumPrice(cars));
	}

}

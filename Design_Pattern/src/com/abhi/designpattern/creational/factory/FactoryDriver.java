package com.abhi.designpattern.creational.factory;

public class FactoryDriver {

	public static void main(String[] args) {
		Vehical car=VehicalFactory.getInstance("Car", 4);
		Vehical bike=VehicalFactory.getInstance("bike", 2);
		
		System.out.println(car.toString());
		System.out.println(bike.toString());

	}

}

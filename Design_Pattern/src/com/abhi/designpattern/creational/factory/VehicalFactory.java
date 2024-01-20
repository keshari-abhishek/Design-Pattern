package com.abhi.designpattern.creational.factory;

public class VehicalFactory {
	
	public static Vehical getInstance(String type,int wheel) {
		if(type.equalsIgnoreCase("car")) {
			return new Car(wheel);
		}else if(type.equalsIgnoreCase("bike")){
			return new Bike(wheel);			
		}else {
			return null;
		}
	}
}

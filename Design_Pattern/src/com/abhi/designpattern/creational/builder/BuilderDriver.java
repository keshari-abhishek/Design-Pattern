package com.abhi.designpattern.creational.builder;

public class BuilderDriver {

	public static void main(String[] args) {
		Vehical car= new Vehical.VehicalBuilder("1500 CC",2).setAirbags(2).build();
		Vehical bike=new Vehical.VehicalBuilder("800 CC", 2).build();
		
		System.out.println(car.getEngine());
		System.out.println(car.getWheel());
		System.out.println(car.getAirbags());
		System.out.println("---------------------------------------------------");
		System.out.println(bike.getEngine());
		System.out.println(bike.getWheel());
		System.out.println(bike.getAirbags());
	}

}

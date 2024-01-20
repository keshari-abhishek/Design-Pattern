package com.abhi.designpattern.creational.factory;

public class Bike extends Vehical {

	private int wheel;
	
	Bike(int wheel){
		this.wheel=wheel;
	}
	
	@Override
	public int getWheel() {
		// TODO Auto-generated method stub
		return wheel;
	}

}

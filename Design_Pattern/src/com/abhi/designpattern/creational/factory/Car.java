package com.abhi.designpattern.creational.factory;

public class Car extends Vehical{

	private int wheel;
	
	Car(int wheel){
		this.wheel=wheel;
	}
	
	@Override
	public int getWheel() {
		// TODO Auto-generated method stub
		return wheel;
	}

}

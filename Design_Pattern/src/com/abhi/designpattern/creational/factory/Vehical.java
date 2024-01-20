package com.abhi.designpattern.creational.factory;

abstract public class Vehical {
	
	public abstract int getWheel();
	
	public String toString() {
		return "Wheel : "+getWheel()+" : "+Vehical.class;
	}

}

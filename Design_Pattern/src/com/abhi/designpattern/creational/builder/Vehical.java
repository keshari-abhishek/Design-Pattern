package com.abhi.designpattern.creational.builder;

public class Vehical {
	
	//Compulsory
	private String engine;
	private int wheel;
	//Optional
	private int airbags;
	
	public String getEngine() {
		return engine;
	}
	
	public int getWheel() {
		return wheel;
	}
	
	public int getAirbags() {
		return airbags;
	}
	
	private Vehical(VehicalBuilder builder) {
		this.engine=builder.engine;
		this.wheel=builder.wheel;
		this.airbags=builder.airbags;
	}
	
	public static class VehicalBuilder{
		
		//Compulsory
		private String engine;
		private int wheel;
		//Optional
		private int airbags;
		
		public VehicalBuilder(String engine,int wheel) {
			this.engine=engine;
			this.wheel=wheel;
		}
		
		public VehicalBuilder setAirbags(int airbags) {
			this.airbags=airbags;
			return this;
		}
		
		public Vehical build() {
			return new Vehical(this);
		}
	}

}

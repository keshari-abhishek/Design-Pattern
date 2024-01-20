package com.abhi.designpattern.creational.singleton;

public class SingletonEagerly {
	
	private static SingletonEagerly singletonEagerly=new SingletonEagerly();
	
	private SingletonEagerly() {
		
	}
	
	public static SingletonEagerly getSingletonEagerlyInstance() {
		return singletonEagerly;
	}

}

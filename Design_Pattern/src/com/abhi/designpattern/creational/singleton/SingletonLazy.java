package com.abhi.designpattern.creational.singleton;

public class SingletonLazy {
	
	private static SingletonLazy singletonLazy;
	
	private SingletonLazy() {
		
	}
	
	public static SingletonLazy getSingletonLazyInstance() {
		if(singletonLazy==null) {
			singletonLazy=new SingletonLazy();
		}
		return singletonLazy;
	}

}

package com.abhi.designpattern.creational.singleton;

public class SingletonDriver {

	public static void main(String[] args) {
		
		//Eagerly initialization 
		SingletonEagerly singletonEagerly1 =SingletonEagerly.getSingletonEagerlyInstance();
		SingletonEagerly singletonEagerly2 =SingletonEagerly.getSingletonEagerlyInstance();
		
		System.out.println(singletonEagerly1+" : "+singletonEagerly1.hashCode());
		System.out.println(singletonEagerly2+" : "+singletonEagerly2.hashCode());
		
		//Lazy initialization
		SingletonLazy singletonLazy1= SingletonLazy.getSingletonLazyInstance();
		SingletonLazy singletonLazy2= SingletonLazy.getSingletonLazyInstance();
		
		System.out.println(singletonLazy1+" : "+singletonLazy1.hashCode());
		System.out.println(singletonLazy2+" : "+singletonLazy2.hashCode());
		
		//Synchronized initialization
		SingletonSyncronized singletonSyncronized1= SingletonSyncronized.getSingletonSyncronizedInstance();
		SingletonSyncronized singletonSyncronized2= SingletonSyncronized.getSingletonSyncronizedInstance();
		
		System.out.println(singletonSyncronized1+" : "+singletonSyncronized1.hashCode());
		System.out.println(singletonSyncronized2+" : "+singletonSyncronized2.hashCode());
	}

}

package com.abhi.designpattern.creational.singleton;

public class SingletonSyncronized {

	private static SingletonSyncronized singletonSyncronized;

	private SingletonSyncronized() {

	}

//	public synchronized static SingletonSyncronized getSingletonSyncronizedInstance() {
//		
//		if(singletonSyncronized==null) {
//			singletonSyncronized=new SingletonSyncronized();
//		}
//		return singletonSyncronized;
//	}

	public static SingletonSyncronized getSingletonSyncronizedInstance() {

		synchronized (SingletonSyncronized.class) {
			if (singletonSyncronized == null) {
				singletonSyncronized = new SingletonSyncronized();
			}
		}
		return singletonSyncronized;
	}

}

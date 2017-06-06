package com.zxp.gof01.singleton;
//双重检索式  线程安全、延迟加载、资源利用率高、调用效率高、但不稳定
public class Singleton03 {
	private static Singleton03 instance=null;
	private Singleton03(){
		
	}
	public static Singleton03 getInstance(){
		if(instance==null){
			Singleton03 sc;
			synchronized (Singleton03.class) {
				sc=instance;
				if(sc==null){
					synchronized (Singleton03.class) {
						if(sc==null){
							sc=new Singleton03();
						}
						
					}
					instance=sc;
				}
			}
		}
		return instance;
	}
	

}

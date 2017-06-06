package com.zxp.gof01.singleton;
//静态内部类式（相比于懒汉式更好） 线程安全、延迟加载、资源利用率高、调用效率高
public class Singleton04 {

	private Singleton04(){}
	private static class StaticInnerClass{
		private static final Singleton04 INSTANCE=new Singleton04();
	}
	public static Singleton04 getInstance(){
		return StaticInnerClass.INSTANCE;
	}
	
}

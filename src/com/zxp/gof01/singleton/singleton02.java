package com.zxp.gof01.singleton;
//懒汉式,线程安全、延迟加载、资源利用率高、调用效率低
public class singleton02 {
	private static singleton02 instance=null;
	private singleton02(){}
	public static synchronized singleton02 getInstance(){
		if(instance==null){
			instance=new singleton02();
		}
		return instance;
	}

}

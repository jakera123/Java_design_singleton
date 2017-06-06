package com.zxp.gof01.singleton;
//饿汉式   线程安全、立即加载、资源利用率低、调用效率高
public class singleton01 {
	//天然的线程安全的，类加载时立即加载这个实例
	private static singleton01 instance=new singleton01();
	//构造器私有化
	private singleton01(){}
	public static singleton01 getInstance(){
		return instance;
	}
}

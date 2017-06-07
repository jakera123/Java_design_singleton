package com.zxp.gof01.singleton;
//˫�ؼ���ʽ  �̰߳�ȫ���ӳټ��ء���Դ�����ʸߡ�����Ч�ʸߡ������ȶ�
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

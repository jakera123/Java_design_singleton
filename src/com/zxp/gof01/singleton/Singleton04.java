package com.zxp.gof01.singleton;
//��̬�ڲ���ʽ�����������ʽ���ã� �̰߳�ȫ���ӳټ��ء���Դ�����ʸߡ�����Ч�ʸ�
public class Singleton04 {

	private Singleton04(){}
	private static class StaticInnerClass{
		private static final Singleton04 INSTANCE=new Singleton04();
	}
	public static Singleton04 getInstance(){
		return StaticInnerClass.INSTANCE;
	}
	
}

package com.zxp.gof01.singleton;
//����ʽ,�̰߳�ȫ���ӳټ��ء���Դ�����ʸߡ�����Ч�ʵ�
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

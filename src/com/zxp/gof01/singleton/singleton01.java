package com.zxp.gof01.singleton;
//����ʽ   �̰߳�ȫ���������ء���Դ�����ʵ͡�����Ч�ʸ�
public class singleton01 {
	//��Ȼ���̰߳�ȫ�ģ������ʱ�����������ʵ��
	private static singleton01 instance=new singleton01();
	//������˽�л�
	private singleton01(){}
	public static singleton01 getInstance(){
		return instance;
	}
}

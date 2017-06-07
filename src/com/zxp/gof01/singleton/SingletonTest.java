package com.zxp.gof01.singleton;

import java.util.concurrent.CountDownLatch;

public class SingletonTest {
	public static void main(String[]args) throws Exception{
		long start=System.currentTimeMillis();
		int threadNum=10;
        // A synchronization aid that allows one or more threads to wait until a
        // set of operations being performed in other threads completes.
       // ��������һ���߳�ִ����ɾͼ�1��
		final CountDownLatch countDownLatch=new CountDownLatch(threadNum);
		
		for(int i=0;i<threadNum;i++){
			new Thread(new Runnable() {
				
				public void run() {
					for(int i=0;i<1000000;i++){
	                    // ����ʽ��
                        // Object o = Singleton01.getInstance();
                      // ����ʽ������
                     // Object o = Singleton02.getInstance();
                   // ˫�ؼ����ʽ�����ȶ���������ʹ��
                  // Object o = Singleton03.getInstance();
                 // ��̬�ڲ���
                   Object o = Singleton04.getInstance();
                // ö��ʽ
                 //Object o = Singleton05.INSTANCE;
					}
					
				}
			}).start();
		}
		countDownLatch.await();
		
		long end=System.currentTimeMillis();
		System.out.println("�ܺ�ʱ��"+(end=start));
		
	}

}

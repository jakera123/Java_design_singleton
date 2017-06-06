package com.zxp.gof01.singleton;

import java.util.concurrent.CountDownLatch;

public class SingletonTest {
	public static void main(String[]args) throws Exception{
		long start=System.currentTimeMillis();
		int threadNum=10;
        // A synchronization aid that allows one or more threads to wait until a
        // set of operations being performed in other threads completes.
       // 计数器（一个线程执行完成就减1）
		final CountDownLatch countDownLatch=new CountDownLatch(threadNum);
		
		for(int i=0;i<threadNum;i++){
			new Thread(new Runnable() {
				
				public void run() {
					for(int i=0;i<1000000;i++){
	                    // 饿汉式，
                        // Object o = Singleton01.getInstance();
                      // 懒汉式，最慢
                     // Object o = Singleton02.getInstance();
                   // 双重检测锁式，不稳定，不建议使用
                  // Object o = Singleton03.getInstance();
                 // 静态内部类
                   Object o = Singleton04.getInstance();
                // 枚举式
                 //Object o = Singleton05.INSTANCE;
					}
					
				}
			}).start();
		}
		countDownLatch.await();
		
		long end=System.currentTimeMillis();
		System.out.println("总耗时："+(end=start));
		
	}

}

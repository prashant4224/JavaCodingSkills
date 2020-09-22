package com.javahungry;

public class DeadLockProgram {
	static Object objectLock1 = new Object();
	static Object objectLock2 = new Object();
	
	private static class ThreadName1 extends Thread {
		public void run() {
			
			synchronized (objectLock2) {
				System.out.println("ThreadName1 has lock of objectLock1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("ThreadName1 is waiting for lock objectLock2");
				synchronized (objectLock1) {
					System.out.println(" ");
				}
			}
		}
	}
	
	private static class ThreadName2 extends Thread {
		public void run() {
			
			synchronized (objectLock2) {
				System.out.println("ThreadName2 has lock of objectLock2");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("ThreadName2 is waiting for lock objectLock1");
				synchronized (objectLock1) {
					
					System.out.println(" ");
				}
			}
		}
	}
	

	public static void main(String[] args) {
		ThreadName1 t1 = new ThreadName1();
		ThreadName2 t2 = new ThreadName2();
		
		t1.start();
		t2.start();

	}

}

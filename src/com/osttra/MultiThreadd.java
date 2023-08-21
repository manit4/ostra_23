package com.osttra;

class CustomThread extends Thread {
	
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+", "+i);
		}		
	}	
}
public class MultiThreadd {
	
	public static void main(String[] args) throws InterruptedException {
		
		CustomThread thread1 = new CustomThread();
		CustomThread thread2 = new CustomThread();
		
		thread1.setName("Avi"); 
		thread1.start(); 
		
		thread1.join();
		
		thread2.setName("Parv");
		thread2.start();
	}
}

//class CustomThread extends Thread {
//	
//	public void run() {
//		
//		if(Thread.currentThread().getName().equals("Avi")) {
//			
//			try {
//				sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(Thread.currentThread().getName()+", "+i);
//		}		
//	}	
//}
//public class MultiThreadd {
//	
//	public static void main(String[] args) {
//		
//		CustomThread thread1 = new CustomThread();
//		CustomThread thread2 = new CustomThread();
//		
//		thread1.setName("Avi"); 
//		
//		thread1.start(); 
//		
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		thread2.setName("Parv");
//		
//		Thread.currentThread().setName("Deepti is the main thread");
//		
//		thread2.start();
//	}
//}


//class CustomThread extends Thread {
//	
//	public void run() {
//		
//		try {
//			sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(Thread.currentThread().getName()+", "+i);
//		}		
//	}	
//}
//public class MultiThreadd {
//	
//	public static void main(String[] args) {
//		
//		CustomThread thread1 = new CustomThread();
//		CustomThread thread2 = new CustomThread();
//		
//		thread1.setName("Avi");   thread2.setName("Parv");
//		
//		Thread.currentThread().setName("Deepti is the main thread");
//		
//		thread1.start();    thread2.start();
//		
//		for(int i = 0; i < 10; i++) {
//			
//			System.out.println(Thread.currentThread().getName()+i);
//		}
//	}
//}

//class CustomThread extends Thread {
//	
//	public void run() {
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(Thread.currentThread().getName()+", "+i);
//		}		
//	}	
//}
//public class MultiThreadd {
//	
//	public static void main(String[] args) {
//		
//		CustomThread thread1 = new CustomThread();
//		CustomThread thread2 = new CustomThread();
//		
//		thread1.setName("Avi");   thread2.setName("Parv");
//		
//		Thread.currentThread().setName("Deepti is the main thread");
//		
//		thread1.start();    thread2.start();
//		
//		for(int i = 0; i < 10; i++) {
//			
//			System.out.println(Thread.currentThread().getName()+i);
//		}
//	}
//}

package com.osttra;


class CustomThread implements Runnable {
	
	Account account = new Account();
	
	public void run() {
		
			System.out.println("inside run()");	
			transaction(40);
	}
	
	public void transaction(int amount) {
		
		System.out.println("first statement whcih is validating connection");
		System.out.println("second statement which is validating the credentials...");
		
		synchronized (this) {
			
			if(amount < account.getAmount()) {
				
				System.out.println("Thread "+Thread.currentThread().getName()
						+" is going to withdraw");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				account.withdraw(amount);
				
				System.out.println("Thread "+Thread.currentThread().getName()
						+" has withdrwan and the balance is "+account.getAmount());
			}
			else {
				System.out.println("Insufficient Amount...and the amount is "+account.getAmount());
			}
			
		}
	}
}
public class MultiThreadd {
	
	public static void main(String[] args) throws InterruptedException {
		
		CustomThread customThread1 = new CustomThread();
		
		Thread thread1 = new Thread(customThread1);  thread1.setName("Trijal");
		Thread thread2 = new Thread(customThread1);  thread2.setName("Parv");
		
		thread1.start();    thread2.start();
	}
}


//class CustomThread implements Runnable {
//	
//	Account account = new Account();
//	
//	public void run() {
//		
//			System.out.println("inside run()");	
//			transaction(40);
//	}
//	
//	synchronized public void transaction(int amount) {
//		
//		System.out.println("first statement whcih is validating connection");
//		System.out.println("second statement which is validating the credentials...");
//		
//		if(amount < account.getAmount()) {
//			
//			System.out.println("Thread "+Thread.currentThread().getName()
//					+" is going to withdraw");
//			
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
//			
//			account.withdraw(amount);
//			
//			System.out.println("Thread "+Thread.currentThread().getName()
//					+" has withdrwan and the balance is "+account.getAmount());
//		}
//		else {
//			System.out.println("Insufficient Amount...and the amount is "+account.getAmount());
//		}
//	}
//}
//public class MultiThreadd {
//	
//	public static void main(String[] args) throws InterruptedException {
//		
//		CustomThread customThread1 = new CustomThread();
//		
//		Thread thread1 = new Thread(customThread1);  thread1.setName("Trijal");
//		Thread thread2 = new Thread(customThread1);  thread2.setName("Parv");
//		
//		thread1.start();    thread2.start();
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
//	public static void main(String[] args) throws InterruptedException {
//		
//		CustomThread thread1 = new CustomThread();
//		CustomThread thread2 = new CustomThread();
//		
//		thread1.setName("Avi"); 
//		thread1.start();
//		
//		thread2.setName("Parv");
//		thread2.start();
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
//	public static void main(String[] args) throws InterruptedException {
//		
//		CustomThread thread1 = new CustomThread();
//		CustomThread thread2 = new CustomThread();
//		
//		thread1.setName("Avi"); 
//		thread1.start(); 
//		
//		thread1.join();
//		
//		thread2.setName("Parv");
//		thread2.start();
//	}
//}

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

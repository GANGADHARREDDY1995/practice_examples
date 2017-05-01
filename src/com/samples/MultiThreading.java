package com.samples;

public class MultiThreading {
public static void main(String[] args) throws InterruptedException {
	BoothRoom boothRoom = new BoothRoom();
	Thread thread = new Thread(boothRoom);
	Thread thread2 = new Thread(boothRoom);
	Thread thread3 = new Thread(boothRoom);
	thread.setName("BOY");
	thread2.setName("GIRL");
	thread3.setName("other");
	thread.start();
	//thread.join();
	thread2.start();
	//thread2.join();
	thread3.start();
	//thread3.join();
}
}
class BoothRoom implements Runnable{
	synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+"..has enter bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+"..has using bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+"..has exit bathroom");
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("invalid");
		}
		
	}
}

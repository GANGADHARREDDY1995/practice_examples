package com.samples;

import java.util.Scanner;

public class BankingMain {
public static void main(String[] args) {
	Banking banking1 = new Banking();  
	Banking banking2 = new Banking();
	Banking banking3 = new Banking();
	banking1.setName("BANKING");
	banking2.setName("PRINTING");
	banking3.setName("ADDITION");
	banking1.start();
	banking2.start();
	banking3.start();
	
}
}

class Banking  extends Thread{
		public void run(){
	if(getName().equals("BANKING")){
		banking();
	}
	else if(getName().equals("PRINTING")){
		printing();
	}
	else {
		addition();
	}
		}	
		static void banking (){
			Scanner  scanner = new Scanner(System.in);
			System.out.println("enter your proper acc_no");
			int acc_no = scanner.nextInt();
			System.out.println("enter the proper possword");
			int possword = scanner.nextInt();
			
			try {
				Thread.sleep(50000);
				System.out.println("preparing");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("banking activity is complited");
			
		}
		void printing(){
			try {
			System.out.println("printing activity is started");
			for(int i = 0; i <=4;i++){
				Thread.sleep(5000);
				System.out.println("gangadhar");
			}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		void addition(){
			System.out.println("adding activity is started");
			int a=10;
			int b=20;
				int	c= a+b;
			System.out.println("addition value is :::::::"+c);
		}
		
	}

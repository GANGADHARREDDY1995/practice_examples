package com.samples;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

//we are using multi try blocks
//usin single try catch  block
public class ExceptionPgrms {
	public static void main(String[] args) throws Exception {
		System.out.println("connection  established");
		SeparateWrite sw = new SeparateWrite();
		OtherSeparate os = new OtherSeparate();
		try {
			sw.firstTry();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("invalid plz chech once............!!");
		}
		try {
			os.Secoundtrry();
		} catch (Exception e) {
			System.out.println("invalid ");
		}
		System.out.println("connection closed");
	}
}

class SeparateWrite {
	Scanner scanner;

	void firstTry() {
		scanner = new Scanner(System.in);
		System.out.println("enter the first add value");
		int a = scanner.nextInt();
		System.out.println("enter the secound add value");
		int b = scanner.nextInt();
		int c = a + b;
		System.out.println("result value is :::" + c);
	}

}

class OtherSeparate {
	Scanner scanner = new Scanner(System.in);

	void Secoundtrry() {
		System.out.println("enter the first div value");
		int d = scanner.nextInt();
		System.out.println("enter the secound div value");
		int e = scanner.nextInt();
		int f = d / e;
		System.out.println("result value is :::::::::::::" + f);
	}
}
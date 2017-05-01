package com.samples;

public class Statement implements Constants {
	public static void main(String[] args) {
		String a = "e";
		
		switch (a) {
		case A:
			System.out.println("this a is valid");
			break;
			
		case B:
			System.out.println("this b is valid");
			break;
			
		case C:
			System.out.println("this c is valid");
			break;
			
		case D:
			System.out.println("this d is valid");
			break;
			
		default:
			System.out.println("not valid");
			break;
			
		}
	}
}

interface Constants {
	static final String A = "a";
	static final String B = "b";
	static final String C = "c";
	static final String D = "d";
}

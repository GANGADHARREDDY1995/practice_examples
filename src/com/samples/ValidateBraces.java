package com.samples;


import java.util.Scanner;

public class ValidateBraces {
	public static void main(String[] args) {
		Samples s = new Samples();
		s.display();

	}
}

class Samples {
	final String L_curly = "{";
	String R_curly = "}";
	String L_flo = "[";
	String R_flo = "]";
	String L_squ = "(";
	String R_squ = ")";
	String input;

	void display() {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("enter the operator");
			input = scan.next();

			if (input.contains(L_curly) && input.contains(R_curly)) {
				if (input.contains(L_flo) && input.contains(R_flo)) {
					if (input.contains(L_squ) && input.contains(R_squ)) {
						System.out.println("valid");
					} else {
						System.out.println("invalid");
					}
				}
			}
		} while (true);
	}
}
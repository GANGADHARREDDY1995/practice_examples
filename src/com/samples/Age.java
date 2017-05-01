package com.samples;

import java.util.Scanner;

public class Age {
	static int age = 0;

	public static void main(String[] args) {

		System.out.println("enter the age");
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();

		if (age <= 20) {
			System.out.println("then he/she is a child");
		} else if (age >= 21 && age <= 30) {
			System.out.println("then he/she is  younger");
		} else if (age >= 31 && age <= 60) {
			System.out.println("then he/she is a married person");
		} else if (age >= 61 && age <= 80) {
			System.out.println("then he/she is a grand faaaaaaaa");
		} else {
			System.out.println("dead person");
		}
		scan.close();
	}
}

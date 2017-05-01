package com.samples;

import static com.samples.Calculator.ADD;
import static com.samples.Calculator.AMB;
import static com.samples.Calculator.DIV;
import static com.samples.Calculator.MUL;
import static com.samples.Calculator.SUB;
import static com.samples.Calculator.add;
import static com.samples.Calculator.amb;
import static com.samples.Calculator.div;
import static com.samples.Calculator.mul;
import static com.samples.Calculator.sub;

import java.util.Scanner;

public class SampleSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the first value");
		int first = scan.nextInt();

		System.out.println("enter the secound value");
		int second = scan.nextInt();

		System.out.println("enter the operator");
		String ope_name = scan.next();

		switch (ope_name.toLowerCase()) {
		case ADD:
			System.out.println(add(first, second));
			break;
		case SUB:
			System.out.println(sub(first, second));
			break;
		case DIV:
			System.out.println(div(first, second));
			break;
		case MUL:
			System.out.println(mul(first, second));
			break;
		case AMB:
			System.out.println(amb(first, second));
			break;
		default:
			System.out.println("invalid operator");
			break;
		}
	}
}

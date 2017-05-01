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

//using if condition we are print the 
public class SampleIf {
	public static void main(String[] args) {
		Scanner scan = null;
		//do {
			scan = new Scanner(System.in);
			System.out.println("enter the first value");
			int first = scan.nextInt();
			System.out.println("enter the secound value");
			int second = scan.nextInt();
			System.out.println("enter the operator name");
			String ope_name = scan.next();

			System.out.println("Entered operator is: " + ope_name + " and result is: ");
			if (ope_name.equalsIgnoreCase(ADD)) {
				System.out.println(add(first, second));
			} else if (ope_name.equalsIgnoreCase(SUB)) {
				System.out.println(sub(first, second));
			} else if (ope_name.equalsIgnoreCase(DIV)) {
				System.out.println(div(first, second));
			} else if (ope_name.equalsIgnoreCase(MUL)) {
				System.out.println(mul(first, second));
			} else if (ope_name.equalsIgnoreCase(AMB)) {
				System.out.println(amb(first, second));
			} else {
				System.out.println("invalid user OPERATION : " + ope_name);
			}
		//} while (true);
	}
}

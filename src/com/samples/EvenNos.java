package com.samples;

public class EvenNos {

	static int range = 1;

	public static void main(String[] args) {
		for (; range <= 10; range++) {
			if (range % 2 == 0) {
				System.out.println("even no");
			} else {
				System.out.println(range);
			}
		// range++;
		}
	}
}

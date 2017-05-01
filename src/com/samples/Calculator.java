package com.samples;

public class Calculator {

	public static final String ADD = "add";
	public static final String SUB = "sub";
	public static final String DIV = "div";
	public static final String MUL = "mul";
	public static final String AMB = "amb";

	public static int add(int first, int second) {
		return first + second;
	}

	public static int sub(int first, int second) {
		return first - second;
	}

	public static int mul(int first, int second) {
		return first * second;
	}

	public static int div(int first, int second) {
		return first / second;
	}

	public static int amb(int first, int second) {
		return first % second;
	}
}

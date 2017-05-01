package com.samples;


public class Polymorphism {
	public static void main(String[] args) {
		MethodOverLoading mol = new MethodOverLoading();
		MethodOverridingMethod mom = new MethodOverridingMethod();
		mol.add(20, "gangadhar");
	}
}

class MethodOverLoading {

	void add(int first, String second) {
		System.out.println("MethodOverLoading>>add: " + first);
		System.out.println(second);
	}

	void mul(int a, String b) {
		System.out.println(a);
		System.out.println(b);
	}

	void mul(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
}

class MethodOverridingMethod extends MethodOverLoading {
	void add(int a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
}
package com.samples;

class ganga {

	String name;
	String color;
	int cost;

	ganga() {
		name = "ponting";
		color = "block";
		cost = 5000;
	}

	ganga(String name, String color, int cost) {

		this(name);

	}

	ganga(String name) {
		this.name = name;
		color = "red";
		cost = 10000;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getCost() {
		return cost;
	}

}

public class Dog {
	public static void main(String[] args) {
		
		ganga g = new ganga("reddy");

		System.out.println(g.getName());
		System.out.println(g.getColor());
		System.out.println(g.getCost());

		ganga g1 = new ganga();

		System.out.println(g.getName());
		System.out.println(g.getColor());
		System.out.println(g.getCost());

	}
}

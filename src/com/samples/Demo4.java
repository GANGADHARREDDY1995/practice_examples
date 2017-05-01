package com.samples;

import java.util.TreeSet;



public class Demo4 {
public static void main(String[] args) {
	TreeSet<Integer> ts = new TreeSet<Integer>();
	
	ts.add(100);
	ts.add(30);
	ts.add(300);
	ts.add(111);
	ts.add(99);
	
	for(Integer x : ts){
		System.out.println(x);
	}
	System.out.println(ts.ceiling(30));
	
	System.out.println(ts.contains(30));
	
	System.out.println(ts.floor(100));
	
	
	
}
}

package com.samples;

import java.util.ArrayList;

public class Demo5 {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(10.5);
	al.add("Gangadhar");
	al.add('g');
	al.add(100000);
	for(Object x : al) {
		System.out.println(x);
	}
	
	
	}
}

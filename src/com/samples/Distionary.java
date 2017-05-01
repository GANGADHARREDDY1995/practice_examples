package com.samples;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Distionary {
public static void main(String[] args) throws CloneNotSupportedException {
	Vector  v = new Vector();
	System.out.println("vector class.......");
	v.add(10);
	v.add(20);
	v.add(30);
	System.out.println(v.size());
	Enumeration enumeration =v.elements();
	System.out.println("vector enumaration while loop....");
	while(enumeration.hasMoreElements()){

		System.out.println(enumeration.nextElement());
	}
	System.out.println("vector for loop...");
	for (int i = 0; i <v.size(); i++) {

		System.out.println(v.get(i));
	}
	System.out.println("vector iterator");
	Iterator itr= v.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	System.out.println("list iterator vector...");
	ListIterator iterator = v.listIterator(v.size());
	while(iterator.hasPrevious()){
		System.out.println(iterator.previous());
	}
	System.out.println(v.contains(iterator));
	System.out.println("hash tables");
	Hashtable hashtable = new Hashtable();
	hashtable.put(0, 20);
	hashtable.put(1, 20);
	hashtable.put(2, 20);
	hashtable.put(3, 20);
	hashtable.put(4, 20);
	System.out.println(hashtable);
	Integer i1 = new Integer(100);
	Integer i2 = new Integer(200);
	Integer i3 = new Integer(300);
	Integer i4 = new Integer(400);
	Integer i5 = new Integer(500);
	Vector  v1 = new Vector();
	v1.add(i1);
	v1.add(i2);
	v1.add(i3);
	v1.add(i4);
	v1.add(i5);
	System.out.println("wapper class in vector");
	for (Object object : v1) {
		System.out.println(object);
	}
	int [] array = new int[4];
	System.out.println("array for loop.........");
	array[0]=1000;
	array[1]=2000;
	array[2]=3000;
	array[3]=4000;
	for(int i=0;i<=array.length-1;i++){
		System.out.println(array[i]);
	}
	System.out.println("for each loop:::::::::::::::::::");
	for (int i : array) {
		System.out.println(i);
	}
}
}

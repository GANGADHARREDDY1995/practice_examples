package com.samples;

import java.util.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class 	Demo2 {
public static void main(String args []){
	LinkedList<Integer> ll = new LinkedList<Integer>();
	
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	ll.add(50);
	
	System.out.println("add lists");
	System.out.println(ll);
	
	
	System.out.println("add the value first and last");
	
	ll.addFirst(1000000);
	ll.addLast(20000);
	
	System.out.println(ll);
	System.out.println("order of decending ");
	Iterator<Integer> itr = ll.descendingIterator();
	System.out.println("printing values by using itr ");
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	System.out.println("==========================");
	
	System.out.println("get the methods");
	System.out.println(ll.get(2));
	System.out.println(ll.getFirst());
	System.out.println(ll.getLast());
	System.out.println("offer the values");
	System.out.println("using for loop");
	for(int i=0;i<=ll.size()-1;i++){
		System.out.println(ll.get(i));
	}
	for(Integer x:ll){
		System.out.println(x);
	}
	System.out.println("here i am using collection sorting");
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	list.add(1000);
	list.add(2000);
	list.add(3000);
	
	System.out.println(list);
	Collections.sort(list);
	
	
}
}

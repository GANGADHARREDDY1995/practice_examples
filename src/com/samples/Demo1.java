package com.samples;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeMap;

import javax.xml.bind.Unmarshaller.Listener;

public class Demo1 {
//arraylist
	public static void main(String args []) {
		ArrayList al =new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println("first list");
		ArrayList all=new ArrayList();
		all.add(100);
		all.add(200);
		all.add(300);
		all.add(400);
		System.out.println(all);
		System.out.println("secound list");
		System.out.println(al.size());
		System.out.println("first list size");
		System.out.println(al.get(2));
		System.out.println("first list value");
		System.out.println("first list using iterator");
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(" for loop");
		for(int i=0;i<=all.size()-1;i++){
			System.out.println(all.get(i));
		}
		
		System.out.println(" each for loop");

	
		for(Object x:al){
		System.out.println(x);
	}
		System.out.println("add two lists");
	al.addAll(all);
	System.out.println(al);
	System.out.println("add index based");
	al.add(2, 22);
	System.out.println(al);
	System.out.println("add two lists based on index");
	al.addAll(3, all);
	System.out.println(al);
	System.out.println("is empty method ");
	System.out.println(al.isEmpty());
	System.out.println("get method");
	System.out.println(al.get(1));
	//System.out.println("clear method");
	//al.clear();
//	System.out.println(al);
	System.out.println(al.clone());
	System.out.println("contains methods");
	System.out.println(	al.contains(22));	
	System.out.println("contains all methods");
	System.out.println(al.containsAll(all));
	System.out.println("remove method");
	System.out.println(al.remove(2));
	System.out.println(al);
	System.out.println("equals methods");
	System.out.println(al.equals(all));
	System.out.println("trim method");
	al.trimToSize();
	System.out.println(al.size());
	System.out.println(al);
	System.out.println("remove method");
	//al.removeAll(all);
	System.out.println("retain methods");
	//al.retainAll(all);
	System.out.println(al);
	System.out.println("list iterator");
	ListIterator listr =al.listIterator();
	while(listr.hasNext()==true){
		System.out.println(listr.next());
	}
	System.out.println("list iterator another method");
	ListIterator litr1=al.listIterator(al.size());
	while(litr1.hasPrevious()==true){
		System.out.println(litr1.previous());
	}
	al.set(0, 11111);
	System.out.println(al);
	
	
	
}
}
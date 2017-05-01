package com.samples;

import java.util.Collection;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;

public class Multi_Collections {
	public static void main(String[] args) {
		hash_tables();
	}

	static void hash_tables() {
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("name", "gangadhar");
		ht.put("id", "12751a0135");
		ht.put("phone_num", "8985502467");
		ht.put("age", "22");
		Set<String> set = ht.keySet();
		System.out.println(set);

		Set set1 = ht.entrySet();
		System.out.println(set1);

		Collection collections = ht.values();
		for (Object object : collections) {
			System.out.println(object);

		}
	}
	
	Stack<Multi_Collections> stack  = new Stack<>();
	
	
}

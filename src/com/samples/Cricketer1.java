package com.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class CricketerAdd1 {

	String name;
	int runs;
	int catchs;
	int matchs;
	float avg;

	public CricketerAdd1(String name, int runs, int catchs, int matchs, float avg) {

		this.name = name;
		this.runs = runs;
		this.catchs = catchs;
		this.matchs = matchs;
		this.avg = avg;

	}

	public String getName() {
		return name;
	}

	public int getRuns() {
		return runs;
	}

	public int getMatchs() {
		return matchs;
	}

	public int getCatchs() {
		return catchs;
	}

	public float getAvg() {
		return avg;
	}

	public String toString() {
		return name + " " + runs + " " + matchs + " " + catchs + " " + avg;
	}
}

class comp implements Comparator {

	public int compare(Object x, Object y) {
		if (((CricketerAdd1) (x)).runs > ((CricketerAdd1) (y)).runs) {
			return 1;
		}
		if (((CricketerAdd1) (x)).runs < ((CricketerAdd1) (y)).runs) {
			return -1;
		} else {
			return 0;
		}
	}
}

class comp2 implements Comparator {

	public List arrayList;

	public int compare(Object x, Object y) {
		if (((CricketerAdd1) (x)).avg > ((CricketerAdd1) (y)).avg) {
			return 1;
		}
		if (((CricketerAdd1) (x)).avg < ((CricketerAdd1) (y)).avg) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class Cricketer1 {
	public static void main(String[] argss) throws Exception {
		CricketerAdd1 cd = new CricketerAdd1("Ganga", 20000, 180, 200, 49.5f);
		CricketerAdd1 cd1 = new CricketerAdd1("Siva", 18000, 160, 300, 48.5f);
		CricketerAdd1 cd2 = new CricketerAdd1("Bhargav", 17000, 140, 270, 47.5f);
		CricketerAdd1 cd3 = new CricketerAdd1("Varun", 21000, 140, 270, 47.5f);

		ArrayList<CricketerAdd1> list = new ArrayList<CricketerAdd1>();

		list.add(cd);
		list.add(cd1);
		list.add(cd2);
		list.add(cd3);

		System.out.println("forloop.........................");
		for (Object x : list) {
			System.out.println(x);
		}

		System.out.println("iterator................................");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("listiterator....................");
		ListIterator litr = list.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("this is another listiterator...........................");
		ListIterator litr1 = list.listIterator();
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		System.out.println("linkedList...........................");
		LinkedList list1 = new LinkedList();

		list1.add(cd);
		list1.add(cd1);
		list1.add(cd2);
		list1.add(cd3);

		Iterator liitr = list1.descendingIterator();
		while (liitr.hasNext()) {
			System.out.println(liitr.next());
		}

		System.out.println("collections.....................");

		comp c = new comp();
		Collections.sort(list1, c);
		System.out.println(list1);

		// comp2 c2 new comp2();
		// Collections.sort(list1,c2);
		// System.out.println(list1);
	}
}

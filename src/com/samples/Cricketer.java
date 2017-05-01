package com.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class Player implements Comparable {

	String name;
	int runs;
	int catchs;
	int matchs;
	float avg;

	public Player(String name, int runs, int catchs, int matchs, float avg) {

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

	public int compareTo(Object o) {
		if (this.runs > ((Player) (o)).runs) {
			return 1;
		}
		if (this.runs < ((Player) (o)).runs) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class Cricketer {
	public static void main(String[] args) throws Exception {
		Player cd = new Player("Ganga", 20000, 180, 200, 49.5f);
		Player cd1 = new Player("Siva", 18000, 160, 300, 48.5f);
		Player cd2 = new Player("Bhargav", 17000, 140, 270, 47.5f);
		Player cd3 = new Player("Varun", 21000, 140, 270, 47.5f);

		ArrayList<Player> list = new ArrayList<Player>();

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
		Collections.sort(list1);
		System.out.println(list1);

	}
}

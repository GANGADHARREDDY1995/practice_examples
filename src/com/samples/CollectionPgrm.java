package com.samples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionPgrm {

public static void main(String[] args) {
	Cricketer2 cricketer2 = new Cricketer2("gangadhar", 12000, 48.5f, 300);
	Cricketer2 cricketer3 = new Cricketer2("mohan", 11000, 49.5f, 350);
	Cricketer2 cricketer4 = new Cricketer2("narmada", 20000, 49.9f, 400);
	LinkedList<Cricketer2> arrayList = new LinkedList<Cricketer2>();
	arrayList.add(cricketer2);
	arrayList.add(cricketer3);
	arrayList.add(cricketer4);
	//System.out.println(arrayList);
	Collections.sort(arrayList);
	System.out.println(arrayList);
}
}
class Cricketer2 implements Comparable {
	String name;
	int runs;
	float avg;
	int matches;
	public Cricketer2(String name,int runs,float avg,int matches) {
		this.name =  name;
		this.runs = runs;
		this.avg = avg;
		this.matches  = matches;
	}
	String getName(){
		return name;
	}
	int getRun(){
		return runs;
	}
	float getAvg(){
		return avg;
	}
	int getMatches(){
		return matches;
	}
	public String toString(){
		return name+" "+runs+" "+avg+" "+matches;
	}
	public int compareTo(Object o) {
		if(this.runs < ((Cricketer2)(o)).runs){
		return 1;
		}
		else if(this.runs > ((Cricketer2)(o)).runs){
			return -1;
		}
		else {
			return 0;
		}
	}
}

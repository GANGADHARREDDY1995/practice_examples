package com.samples;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortingCollection {
	public static void main(String[] args) {
	Cricketer3 cricketer2 = new Cricketer3("gangadhar", 12000, 48.5f, 300);
	Cricketer3 cricketer3 = new Cricketer3("mohan", 11000, 49.5f, 350);
	Cricketer3 cricketer4 = new Cricketer3("narmada", 20000, 49.9f, 400);
	LinkedList<Cricketer3> arrayList = new LinkedList<Cricketer3>();
	arrayList.add(cricketer2);
	arrayList.add(cricketer3);
	arrayList.add(cricketer4);
	comp1 c = new comp1();
//	Collections.sort(arrayList.c);
	System.out.println(arrayList);
	comp2 c2 = new comp2();
//	Collections.sort(arrayList.c2);
	System.out.println(arrayList);
	
}
}
class Cricketer3  {
	String name;
	int runs;
	float avg;
	int matches;
	public Cricketer3(String name,int runs,float avg,int matches) {
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
}

class comp1 implements Comparator<Cricketer3>{
	public int compare(Cricketer3 arg1, Cricketer3 arg2) {
		if(((Cricketer3)(arg1)).avg > ((Cricketer3)(arg2)).avg){
			return 1;
		}
		else if(((Cricketer3)(arg1)).runs > ((Cricketer3)(arg2)).runs){
			return 1;
		}
		else {
			return 0;
		}
	}
class comp2 implements Comparator<Cricketer3>{
	
	public int compare(Cricketer3 arg3, Cricketer3 arg4) {
		if(((Cricketer3)(arg3)).avg > ((Cricketer3)(arg4)).avg){
			return 1;
		}
		else if(((Cricketer3)(arg3)).avg > ((Cricketer3)(arg4)).avg){
			return 1;
		}
		else {
			return 0;
		}
	}
}
}
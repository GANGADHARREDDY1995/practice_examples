package com.samples;

public class Sampledate {
public static  void main(String[] args) {
	
BoyAge: for(int boyage=0;boyage<=5;boyage++){
	System.out.println("boy  age loop condition starting<<<<<<<<<<<<<");
	GirlAge: for(int girlage=10;girlage<=15;girlage++){
		System.out.println("girl  age loop condition starting");
		
		if(boyage==4){
			System.out.println("i if condition is applying..........................................i");
			break;
		}
		if(girlage==14){
			System.out.println("j if condition is applying................................................................j");
			continue;
		}
		System.out.println("girl  age loop condition ending");
	}
	//GOTO BoyAge;
  System.out.println("boy  age loop condition ending>>>>>>>>>>>>>>>>>>>");
  
}
}
}

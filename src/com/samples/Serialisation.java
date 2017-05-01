package com.samples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Demo6 {
	String name;
	int runs;
	float avg;

	Demo6(String name, int runs, float avg) {
		this.name = name;
		this.runs = runs;
		this.avg = avg;
	}

	void disp() {
		System.out.println(name);
		System.out.println(runs);
		System.out.println(avg);
	}
}

public class Serialisation {
	public static void main(String[] args) throws Exception {
		String temp;
		String path1 = "F:\\GANGA\\practice\\iopgrm\\DeSerialisation.txt";
		String path = "F:\\GANGA\\practice\\iopgrm\\Serialisation.txt";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Demo6 x = (Demo6) ois.readObject();
		x.disp();

	}
}

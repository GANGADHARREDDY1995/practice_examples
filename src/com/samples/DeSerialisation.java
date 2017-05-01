package com.samples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSerialisation {
public static void main(String[] args) throws Exception {
	String path="G:\\File.txt";
	String path1 = "G:\\FileOutput.txt";
	FileInputStream fis = new FileInputStream(path);
	ObjectInputStream ois = new ObjectInputStream(fis);
	Player1 p=(Player1)ois.readObject();
	p.disp();
}
}
class Player2 implements Serializable {

	String name;
	int runs;
	int catchs;
	int matchs;
	float avg;

	public Player2(String name, int runs, int catchs, int matchs, float avg) {

		this.name = name;
		this.runs = runs;
		this.catchs = catchs;
		this.matchs = matchs;
		this.avg = avg;

	}

	public void disp(){
		System.out.println(name);
		System.out.println(runs);
		System.out.println(catchs);
		System.out.println(matchs);
		System.out.println(avg);
		
	}
}


package com.samples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialisationPgrm {
public static void main(String[] args) throws Exception {
	Player1 player = new Player1("ganga", 21000, 520, 1000, 49.5f);
	String path = "G:\\File.txt";
	FileOutputStream fos = new FileOutputStream(path);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(player);
}
}
class Player1 implements Serializable {

	String name;
	int runs;
	int catchs;
	int matchs;
	float avg;

	public Player1(String name, int runs, int catchs, int matchs, float avg) {

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

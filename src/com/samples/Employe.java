package com.samples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Employe {
public static void main(String[] args) throws Exception {
	String path1="F:\\GANGA\\practice\\iopgrm\\EmployInput.txt";
	String path2="F:\\GANGA\\practice\\iopgrm\\EmployeOutput.txt";
	String  temp;
	FileReader fr = new FileReader(path1);
	FileWriter fw = new FileWriter(path2);
	BufferedReader br = new BufferedReader(fr);
	BufferedWriter bw = new BufferedWriter(fw);
	while((temp=br.readLine())!=null) {
		bw.write(temp);
		//System.out.println(temp);
	}
	bw.flush();
	
}
}

package com.samples;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
//input Out pgrms	
public class Demo {
public static void main(String args []) throws Exception  {
	String path1 = "F:\\GANGA\\practice\\iopgrm\\input.txt";
	String path2 = "F:\\GANGA\\practice\\iopgrm\\output.txt";
	String temp;
	
	Scanner fis = new Scanner(new File(path1));
	FileWriter fos = new FileWriter(path2);
	
	while((fis.hasNext())) {
		temp= fis.nextLine();
		fos.write(temp);
	}	
	fos.flush();
	fos.close();
	fis.close();
	
	String path3 = "F:\\GANGA\\practice\\iopgrm\\input.txt";
	String path4 = "F:\\GANGA\\practice\\iopgrm\\output.txt";
		//String temp;
	FileReader fr=new FileReader(path1);
	FileWriter fw=new FileWriter(path2);
	//while((temp=fr.read())==-1){
	//	fw.wait(temp);
	//}
	
	}
}

package com.samples;

import java.io.*;

public class IoPgrms {
public static void main(String[] args) throws Exception {
	String path = "G:\\File.txt";
	File f = new File(path);
	System.out.println(f.canRead());
	System.out.println(f.canWrite());
	System.out.println(f.exists());
	System.out.println(f.isFile());
	System.out.println(f.canExecute());
	System.out.println(f.getAbsolutePath());
	System.out.println(f.lastModified());
	System.out.println(f.getParent());
	System.out.println(f.getName());
	System.out.println(f.length());
	System.out.println(f.isHidden());
}
}

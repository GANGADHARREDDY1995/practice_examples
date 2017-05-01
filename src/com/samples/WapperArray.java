package com.samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class WapperArray {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size");
		String stirng_Size = reader.readLine();
		Integer integer_Size = new Integer(stirng_Size);
		int[] is = new int[integer_Size];
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < is.length; i++) {
			System.out.println("enter the values");
			String stirng_Size1 = reader.readLine();
			is[i] = new Integer(stirng_Size1);
		}
		for (int i = 0; i < is.length; i++) {
			System.out.println("results are...." + is[i]);
		}

	}
}

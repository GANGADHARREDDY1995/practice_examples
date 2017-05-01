package com.samples.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite {
	private static final String startIndex = "<VTSN>";
	private static final String lastIndex = "</VTSN>";

	public static void main(String[] args) {
		String path = "F:/GANGA Workspace/practice_examples/src/com/samples/files";
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		try {
			File fileDirectory = new File(path);
			File[] files = fileDirectory.listFiles();
			for (File file : files) {
				if (file.getName().contains(".txt")) {
					System.out.println("File: " + file.getPath());
					FileReader reader = new FileReader(file);
					bufferedReader = new BufferedReader(reader);
					String temp = bufferedReader.readLine();
					System.out.println("Actual content: " + temp);
					String stringValue = temp.substring(temp.lastIndexOf(startIndex), temp.indexOf(lastIndex));
					stringValue = stringValue.replace(startIndex, "");
					System.out.println(stringValue);
					int integerValue = Integer.parseInt(stringValue);
					System.out.println(integerValue);
					for (int i = 1; i <= 10; i++) {
						integerValue = integerValue + 1;
					}
					System.out.println(integerValue);
					String replacedContent = temp.replace(startIndex + stringValue + lastIndex,
							startIndex + integerValue + lastIndex);
					System.out.println("modified content :" + replacedContent);
					FileWriter writer = new FileWriter(file.getPath());
					bufferedWriter = new BufferedWriter(writer);
					bufferedWriter.write(replacedContent);
					bufferedWriter.flush();
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found in lcoation: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Eror while loading files: " + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}

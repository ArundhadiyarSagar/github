package com.stringPrograms;

import java.io.FileReader;
import java.io.BufferedReader;

public class NoOfWordsInFile {

	public static void main(String[] args) throws Exception{
		FileReader file = new FileReader("C:\\Users\\arund\\eclipse-workspace\\PlacementTraining\\src\\com\\stringPrograms\\data.txt");
		BufferedReader br = new BufferedReader(file);
		String line = "";
		int count = 0;
		while((line = br.readLine()) != null) {
			String[] word = line.split("([,. ]+)");
			count += word.length;
		}
		System.out.print("Total Number of Words in File : " + count);
		br.close();
	}

}

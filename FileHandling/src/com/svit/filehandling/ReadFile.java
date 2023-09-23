package com.svit.filehandling;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {
	public static void main(String args[]) {
		try {
			File f1 = new File("demo.txt");
			Scanner myReader = new Scanner(f1);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}catch(FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		
	}
}

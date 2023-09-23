package com.svit.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String args[]) {
		try {
			FileWriter mywrite = new FileWriter("demo.txt");
			mywrite.write("Hello...This is a test file created via File Handling.");
			mywrite.close();
			System.out.println("Data inserted successfully.");
		}catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		
	}
}

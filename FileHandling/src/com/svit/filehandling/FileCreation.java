package com.svit.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String args[]) {
		try {
			File f1 = new File("demo.txt");
			if(f1.createNewFile()) {
				System.out.println("File " + f1.getName() + " has been created successfully.");
			}
			else {
				System.out.println("File exsists.");
			}
		}catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}

package com.svit.filehandling;

import java.io.File;

public class DeleteFile {
	public static void main(String args[]) {
			File f1 = new File("demo.txt");
			if(f1.delete()) {
				System.out.println("File " + f1.getName() + " has been deleted successfully.");
			}
			else {
				System.out.println("Failed to delete file.");
			}
	}
}

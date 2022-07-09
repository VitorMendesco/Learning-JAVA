package com.java;

// writing and reading based on bytes
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile; // input and output

//writing and reading based on characters
import java.io.FileWriter;
import java.io.PrintWriter;

import java.io.FileReader;
import java.io.BufferedReader;

// Exceptions
import java.io.IOException;
import java.io.FileNotFoundException;

// Represents a file or directory
import java.io.File;

// More reliable file manager
import java.nio.file.Files;
import java.nio.file.Path;

public class ImFineWorld {

	public static void main(String[] args) {

		boolean fileExisted = false;
		
		File directory = new File("C://testDirectory");
		if(!directory.exists()) {
			if (directory.mkdir()) System.out.println("Directory created!");
			else System.out.println("Directory not created!");
		}

		File file = new File(directory,"testFile.txt");

		if (file.exists()) {
			System.out.println("\"testFile.txt\" exists!\n");
			System.out.println("Can read: " + file.canRead());
			System.out.println("Can write: " + file.canWrite());
			System.out.println("Can execute: " + file.canExecute());
			System.out.println("Size: " + file.length());
			System.out.println("Path: " + file.getPath());		

			fileExisted = true;
			// file.deleteOnExit(); // deletes file on exit
		} else {
			try {

				if (file.createNewFile()) {
					System.out.println("testFile.txt created!");
				} else System.out.println("testFile.txt not created!");

			} catch(IOException e) {
				System.err.println("Error while creating testFile.txt");
				e.printStackTrace();
			}
		}

		// CREATING AND WRITING FILES
		try {

			System.out.println("Starting writing...\n");

			FileWriter stream = new FileWriter(file);
			PrintWriter print = new PrintWriter(stream);

			print.println("Hello World!");
			print.println("\n\tTesting tabulation command \"\\t\"");
			print.println("\nHello Again!");

			print.close();
			stream.close();

		} catch (IOException e) {
			System.err.println("An error occured while creating or writing at testFile.txt");
			e.printStackTrace();			
		} finally {
			System.out.println("\n\tEndind writing...\n");
		}

		// OPENING AND READING FILES
		try {

			System.out.println("\tStarting reading...");

			FileReader stream = new FileReader(file);
			BufferedReader reader = new BufferedReader(stream);

			String line = reader.readLine(); // reader obj reading line
			while(line != null) {
				System.out.println(line);
				line = reader.readLine(); // read next line
			}

			reader.close();
			stream.close();

		} catch (FileNotFoundException e) {
			System.err.println("File not found. Verify if path is correct!");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("An error occured while reading testFile.txt");
			e.printStackTrace();
		} finally {
			System.out.println("\n\t\tEnding reading...");
		}

		if (fileExisted) {
			System.out.println("\nDeleting all...");
			file.delete();
			
			// To use the below delete method, first, delete all archives inside the directory
			Path dirPath = directory.toPath();
			try {
				Files.delete(dirPath);
			} catch (IOException e) {
				System.err.println("An error occured while trying to delete folder C://testDirectory");
				e.printStackTrace();
			}
		}
		
	}

}

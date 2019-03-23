package com.capgemini.file.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * File file =new File("C:\\books\\Head_First_Java_2nd_Edition.pdf");
		 * System.out.println(file.exists());
		 * 
		 * File folder =new File("C:\\books1"); System.out.println(folder.exists());
		 */

		/*
		 * File file = new File("test.txt"); if (!file.exists()) { file.createNewFile();
		 * System.out.println("file is created");
		 * 
		 * }
		 */

		// FileWriter writer = new FileWriter(file);
		// BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		/*
		 * PrintWriter writer =new PrintWriter(new FileWriter(file,true));
		 * writer.println("Helloo....."); writer.println("How are you.....");
		 * writer.println("I hope you are fine....."); writer.println("bye.....");
		 * 
		 * writer.close();
		 * System.out.println("content has been written succesffullyy.....");
		 */
		/*
		 * FileReader reader = new FileReader(
		 * "C:\\Assignments\\Core_Java\\javaassignments\\AssignmentAnswers\\Day3\\assignment\\inheritance-assignment\\src\\com\\capgemini\\employee\\model\\BankAccount.java"
		 * );
		 * 
		 * BufferedReader bReader = new BufferedReader(reader);
		 * 
		 * PrintWriter writer = new PrintWriter("BankAccountt2.java");
		 * 
		 * String content;
		 * 
		 * while ((content = bReader.readLine()) != null) { //
		 * System.out.println(content);
		 * 
		 * writer.println(content); }
		 * 
		 * System.out.println("success");
		 * 
		 * writer.close(); bReader.close(); reader.close();
		 */

		/*
		 * File windowsDirectory = new File("C:\\Windows");
		 * System.out.println(windowsDirectory.isDirectory()); String content[] =
		 * windowsDirectory.list();
		 * 
		 * for (String s : content) {
		 * 
		 * System.out.println(s); }
		 */
		
		
		File newDir=new File("myDir");
		if(!newDir.exists()) {
			
			newDir.mkdir();
			System.out.println("folder created");
			
		}
		
		File file=new File(newDir , "myfile.txt");
		if(!file.exists())
		{
			file.createNewFile();
			System.out.println("created file successfully");
		}
		

	}
}

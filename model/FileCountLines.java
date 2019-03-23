package com.capgemini.file.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCountLines {

	public int lineCount() {

		int lines = 0;
		BufferedReader bReader;

		try {

			FileReader reader = new FileReader(
					"C:\\Assignments\\Core_Java\\javaassignments\\AssignmentAnswers\\Day3\\assignment\\inheritance-assignment\\src\\com\\capgemini\\employee\\model\\BankAccount.java");
			bReader = new BufferedReader(reader);

			while ((bReader.readLine()) != null) {
				lines++;
			}

			System.out.println("Total number of lines are :" + lines);

		}

		catch (FileNotFoundException file) {
			file.printStackTrace();

		}

		catch (IOException io) {
			io.printStackTrace();
		}
		return lines;

	}
}
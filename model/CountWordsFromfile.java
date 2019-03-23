package com.capgemini.file.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsFromfile {
	public int WordCount() {

		int line=0;
		int word=0;
		String content=null;
		BufferedReader bReader;

		try {

			FileReader reader = new FileReader(
					"C:\\Assignments\\Core_Java\\javaassignments\\AssignmentAnswers\\Day3\\assignment\\inheritance-assignment\\src\\com\\capgemini\\employee\\model\\BankAccount.java");
			bReader = new BufferedReader(reader);

			while ((content = bReader.readLine()) != null) {
				
				line++;
				String[] words=content.split(" ");
				word =word+words.length;
				
			}

			System.out.println("Total number of words are :" + word);

		}

		catch (FileNotFoundException file) {
			file.printStackTrace();

		}

		catch (IOException io) {
			io.printStackTrace();
		}
		return word;

	}
}

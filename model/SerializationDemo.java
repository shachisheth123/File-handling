package com.capgemini.file.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageInputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		DebitCard debitCard = new DebitCard(1230456098703216L, 234, 11, 2021);
		BankAccount account = new BankAccount(101, "John", "Saving", 34000, debitCard);

		// Serialization proceess

		FileOutputStream fileOutputStream = new FileOutputStream("account.ser");

		ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

		outputStream.writeObject(account);
		outputStream.close();
		
		
		FileInputStream fileInputStream =new FileInputStream("account.ser");
		ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);

	
		BankAccount account2=(BankAccount)inputStream.readObject();
	    
		fileInputStream.close();
		System.out.println(account2);
		
		
		
		
	}

}

package com.capgemini.file.model;

import java.io.File;

public class FileExists {

	
	
	public boolean isFile()
	{
		
		File file = new File ("C:\\Assignments\\Core_Java\\Assignments\\Day-8-FileIO\\assignments_io.txt");
		System.out.println(file.exists());
		return true;
	}
	
}

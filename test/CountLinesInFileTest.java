package com.capgemini.file.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.file.model.FileCountLines;

public class CountLinesInFileTest {

	
	FileCountLines fileCountLines=new FileCountLines();
	@Test
	public void testFileCountLines() {
		

	assertEquals(67,fileCountLines.lineCount());
	
	}
}

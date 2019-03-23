package com.capgemini.file.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.file.model.CountWordsFromfile;

public class CountWordsFromFileTest {

	CountWordsFromfile countWordsFromFile;

	@Test
	public void testWordCount()
	{
		countWordsFromFile=new CountWordsFromfile();
		assertEquals(150, countWordsFromFile.WordCount());
	}

}

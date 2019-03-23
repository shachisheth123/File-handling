package com.capgemini.file.test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.capgemini.file.model.FileExists;

public class FileExitsTest {

	FileExists fileDemo;

	@Test
	public void testIsFileExists() {
		fileDemo = new FileExists();
		assertEquals(true, fileDemo.isFile());
	}
}

package com.sstummala.codingproblems;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;


public class DeleteOldFilesTest {
	DeleteOldFiles classUnderTest;

	@Before
	public void setUp() throws Exception {
		classUnderTest = new DeleteOldFiles();
	}

	@Test
	public void testDeleteOldFiles() {
		
		HashSet<File> deletedFiles= classUnderTest.deleteOldFiles("D:\\test\\DeleteOldFilesTest", 7);
		boolean flag = true;
		for(File cur:deletedFiles){
			System.out.println(cur.getPath() + " " + cur.lastModified());
			if(cur.exists()) flag=false;
		}
		assertTrue(flag);
	}

}

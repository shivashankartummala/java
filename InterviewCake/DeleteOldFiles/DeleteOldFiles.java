package com.sstummala.codingproblems;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashSet;

public class DeleteOldFiles {

	public HashSet<File> deleteOldFiles(String path, int olderThan){
		HashSet<File> deleted = new HashSet<File>();
		
		//intialize your date to any date 
		long millis = (System.currentTimeMillis() - olderThan * 24 * 3600 * 1000  );
		
		//System.out.println("older than" + millis);
		deleteOldFiles(new File(path), millis, deleted);
		
		return deleted;
	}
	
	public void deleteOldFiles(File path, long millis, HashSet<File> deleted){
		
		
		for(File curFile: path.listFiles()){
			//System.out.println(curFile + " is " + curFile.lastModified() + " age" );
			if(curFile.isDirectory()) {
				//System.out.println(curFile + "is a dir");
				deleteOldFiles(curFile, millis, deleted);
			}
			if(curFile.getName().endsWith(".txt") && curFile.lastModified()<=millis) {
				
				try {
					Files.delete(curFile.toPath());
					deleted.add(curFile); 
					//System.out.println(curFile + " is deleted " + curFile.lastModified() + " age" );
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
				
				//System.out.println(curFile + " will be deleted is " + curFile.lastModified() + " age" );
			}
			
			
		}
		
		
	}
	
	/*public static void main(String[] args){
		deleteOldFiles("D:\\test\\DeleteOldFilesTest", 7);
	}*/
}

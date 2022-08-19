package com.files.demo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx01 {
	
	
	public static void main(String[] args)  {
		
		FileReader in =null;     // to read a file.
		
		BufferedReader br =null;
		
		try {
			     in = new FileReader("D:\\readerfile/text.txt ");
			
			     br = new BufferedReader(in);
			     String line;
			       
			    while((line=br.readLine())!=null)
			     {
			     	System.out.println(line);
			     }
	     	}
		   catch(FileNotFoundException ex) {
			   // ex.printStackTrace();
			   System.out.println(ex.getMessage());
			   
		   }
			
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		   
		
		finally {
	    	   try {
	    	   if(in!=null)
	    		   in.close();
	    	   
	    	   if(br!=null)
	    		   br.close();
	    	   }
	    	   catch(IOException ex) {
	    		   ex.printStackTrace();
	    		   
	    	   }
	    	   }
		
		
	    } 
	}
	    	


	

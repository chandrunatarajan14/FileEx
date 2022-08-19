package com.files.demo;


import java.io.File;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Scanner;

public class FileEx03 {
	public static void main(String[] arg) {
		
		
		
		try {
			    Scanner sc=new Scanner(new File("D:\readerfile/text.txt "));
			    String current=sc.next();
			    String longWord="";
			    
			    while(sc.hasNext()) {
			    	if(current.length()>longWord.length()) {
			    		longWord=current;
			    	}
			    	
			    }
			    System.out.println("The longest word is :" +longWord);
			    
			     
			     
	     	}
		   catch(FileNotFoundException ex) {
			   // ex.printStackTrace();
			   System.out.println(ex.getMessage());
			   
		   }
			
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		   
		/*
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
	    	   }*/
		
	}

}

package com.files.demo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileEx02 {

	public static void main(String[] args) {
		FileReader in =null;
    
		BufferedReader br =null;
	
	      try {
				     
				   ArrayList<String> lines=new ArrayList<String>();
				
				     in = new FileReader("D:\\readerfile/text.txt ");
				     br = new BufferedReader(in);
				     
				     String line =br.readLine();  
				     
				     while(line!=null)
				     { 
				    	  
				         lines.add(line);
				    	 
				    	 line=br.readLine();
				    	 
				    	 if(line==null)
				    		 break;
				    	 
			    	
			     }
			   // String str= Arrays.toString(lines.toArray()) ;
			   
			   //System.out.println(str);
			     
			     String[] str=new String[lines.size()];
			     
			     for(int i=0;i<lines.size();i++)
			     {
			    	 str[i]=lines.get(i);
			     }
			     
			     for(String s: str)
			    	 System.out.println("\n\n" +s);
			     
	     	}
			
		    catch(NullPointerException ex) {
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

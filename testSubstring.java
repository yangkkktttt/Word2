package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class testSubstring {
	public static void main(String args[]) {
	
		File file= new File("Word.txt");
		BufferedReader reader = null;
		String temp = null;
		int s=0;
		int line = 0;
		try {
			reader= new BufferedReader(new FileReader(file));
			while((temp = reader.readLine())!=null) {				
			    line++;
			    s=line;
			    System.out.println(s);
			    if(temp.contains("hello")){
			    	int i=temp.indexOf("hello");
			    	String str1=temp.substring(i,i+5);
			    	System.out.println(str1);
			    	}
			}reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}

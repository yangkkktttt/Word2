package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;


public class testMap {
	public static void main(String args[]) throws IOException{  
		File file=new File("Word.txt");
		  BufferedReader br = new BufferedReader(new FileReader(file));
		  String temp = null;
		  TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		  while((temp=br.readLine())!=null){
			  temp.toLowerCase();
		     String r1 = "\\s+";
		     String r2 ="\\w+";
		     String str[] = temp.split(r1);
		     for(String s: str){
		      if(s.matches(r2)){
		        if(!tm.containsKey(s)){
		          tm.put(s,1);
		       }else{
		          tm.put(s,tm.get(s)+1);
		          }
		     }
		   }
		 }
		 System.out.println(tm);
		 }
}   

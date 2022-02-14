package ArrayList1; // 

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	 public static void main(String[] args) {
		 
		 ArrayList ao = new ArrayList();
		           ao.add(10); //  ArrayList is dynamic array
		           ao.add(10);  // dublicate values allow
		           ao.add("Shiv");//null value allow
		           ao.add(20.5);  //any kind of data can store
		           ao.add(null); //
		           ao.add('a');
		           
		           
		           System.out.println(ao);
		           for(Object X : ao)
		           {
		        	   System.out.println(X);
		           }
		           
		           System.out.println(ao.contains(10));
		           System.out.println(ao.get(0));
		           System.out.println(ao.isEmpty());
		            
		          }
	
	 

}

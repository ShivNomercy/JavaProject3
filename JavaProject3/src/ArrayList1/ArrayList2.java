package ArrayList1;
import java.util.*;
public class ArrayList2 {
	
	public static void main(String[] args) {
		 
	  ArrayList<Object> ao = new ArrayList<Object>();
	                     ao.add(10);
	                     ao.add(10);
	                     ao.add(20);
	                     ao.add(30.2);
	                     ao.add("Shiv");
	                     ao.add('a');
	               System.out.println(ao);
	               for(Object X:ao)
	               {
	            	   System.out.println(X);
	               }
	     System.out.println("===========================");
	           Iterator itr = ao.iterator();
	             while(itr.hasNext())  // read data
	             {
	            	 System.out.println(itr.next()); // printdata
	             }
	             System.out.println("-----------------------");
	        		  ao.remove(0); 
	        		  System.out.println(ao);
	        		  ao.add(100);
	        		  System.out.println(ao);
	        		  ao.add(0, 500);
	        		  System.out.println(ao);
	        	   
	        		   
	  
	  
	}

}

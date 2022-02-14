package MapProject;

import java.util.HashMap;

public class Map1 {
	public static void main(String[] args) {
		  HashMap<Integer,String>  map = new HashMap<Integer,String> ();  // Map is not part of collection
		           map.put(101, "rahul") ;// entry of key & pairs
		           map.put(102, "Kiran") ;// key must be unic
		           map.put(103, "rahul") ;// duplicate values allow
		           map.put(104, "Arjun") ;//  
		           map.put(105, "Shiv") ; 
		           map.put(106, "ramesh") ; 
		           map.put(107, "rahul") ; 
		           
		           System.out.println(map);
		     System.out.println("=====================");
		     if(map.containsKey(1006))
		     {
		    	String s = (String) map.get(1006); 
		    	System.out.println("The roll no. off : "+s);
		     }else
		     {
		    	 System.out.println("Data not found");
		     }
		        for(int i :map.keySet())
		        {
		        	System.out.println(i + " "+ map.values());
		        }
		        
		       
		         
		       	
	}
}

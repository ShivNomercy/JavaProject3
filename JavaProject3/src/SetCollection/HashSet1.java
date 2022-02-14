package SetCollection;
import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
		  HashSet ho =new HashSet();
		          ho.add(10);  // Duplicate not allow
		          ho.add(10);  // no order sequence
		          ho.add(10.20); // null key allow only once
		          ho.add("Shiv"); //
		          ho.add('a');
		          ho.add(1000);
		          ho.add(null);
		          System.out.println(ho);
		         System.out.println("===============================");
		         for(Object X:ho)
		         {
		        	 System.out.println(X);
		         }
		         
		         Iterator itr = ho.iterator();
		         while(itr.hasNext())
		         {
		        	 System.out.println(itr.next());
		         }
		         
		         
	}
}

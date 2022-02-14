package LinkedList1;
import java.util.*;
public class LinkedList1 {
	public static void main(String[] args) {
		
		 LinkedList lo = new LinkedList();
		            lo.add(10);
		            lo.add(10);
		            lo.add(2.5);
		            lo.add("Shiv");
		            lo.add('s');
		            lo.add(null);
		            System.out.println(lo); // Way 1
		            System.out.println("===========================");
		         for(Object x :lo)  // Way 2
		         {
		        	 System.out.println(x);
		         }
		         System.out.println("-----------------------------");
		     Iterator itr = lo.iterator() ;// way 3
		     while(itr.hasNext())
		     {
		    	 System.out.println(itr.next());
		     }
	}

}

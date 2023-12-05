package Collections;

import java.util.*;
public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		 	ll.add("Kevin");
	        ll.add("Vinay");
	        ll.add("Anand");
	        Iterator itr=ll.iterator();
	        while(itr.hasNext())
	        {
	        	System.out.println(itr.next());
	        }

	}

}

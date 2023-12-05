package Collections;

import java.util.*;
public class TestQueue {

	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<>();
		queue.add("BOB");
		queue.add("ROY");
		queue.add("SURYA");
		System.out.println("Head : "+queue.element());
		System.out.println("Head : "+queue.peek());
		System.out.println("Iterating queue elements");
		Iterator itr=queue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());

		}
		


		
	}

}

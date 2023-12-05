package Collections;

import java.util.*;

public class TestStack {

	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<>();
		st.push(100);
		st.push(273);
		st.push(187);
		st.pop();
		Iterator i=st.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

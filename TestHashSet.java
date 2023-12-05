package Collections;
import java.util.*;

public class TestHashSet {

	public static void main(String[] args) {
		Set<String> hset=new HashSet<>();
		hset.add("sandeep");
		hset.add("Amit");
		hset.add("Arjun");
		hset.add("Arjun");
	
		Iterator it=hset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}

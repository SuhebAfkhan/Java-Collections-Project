package Collections;

import java.util.*;



public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vijay");
        names.add("Raju");
        names.add("Anand");
        Iterator itr = names.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }

    }
}

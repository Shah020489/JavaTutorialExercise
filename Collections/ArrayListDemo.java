package Collections;

import java.util.ArrayList;
import java.util.Collections.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <String> al=new ArrayList<String>();
        boolean b=al.isEmpty();
        System.out.println("Is empty "+b);

        al.add("Shakeel");
        al.add("jameel");
        al.add("Wazeel");
        al.add("Nouman");
        al.add("Naveed");
        System.out.println("Elements in Array List  "+al);

        //System.out.println("Sorted elements"+ Collection.sort(al));

    }
}

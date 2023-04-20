package collections.MyCollection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // creating Vector
        Vector<String> v0 = new Vector<>();
        Vector<Integer> v1 = new Vector<>();

        v0.add("Swati");
        v0.add("Sharma");
        v1.add(12);
        v1.add(4);

        System.out.println("\nVector integer elements are:");
        Enumeration e1 = v1.elements();
        while (e1.hasMoreElements()){
            int i = (Integer)e1.nextElement();
            System.out.println(i +" ");
        }

        System.out.println("\nVector String elements are:");
        Enumeration e2 = v0.elements();
        while (e2.hasMoreElements()){
            String str = (String) e2.nextElement();
            System.out.println(str +" ");
        }

    }
}


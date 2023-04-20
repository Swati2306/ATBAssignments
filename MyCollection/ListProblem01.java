package collections.MyCollection;

//Sort list usding collection.sort

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListProblem01 {
    public static void main(String[] args) {
        List l2 = new ArrayList<>();

        l2.add(12);
        l2.add(45);
        l2.add(38);

        System.out.println(l2);
        Collections.sort(l2);
        l2.sort(Comparator.naturalOrder());
        System.out.println(l2);
        System.out.println(l2);

        //  System.out.println(l1.indexOf(s3));
        //    System.out.println(l1.get(0));


    }
}

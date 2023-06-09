package collections.MyCollection.ListUsed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    public static  ArrayList removeDuplicates(ArrayList list)
    {

        // Create a new ArrayList
        ArrayList newList = new ArrayList();

        // Traverse through the first list
        for (Object element : list) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }

        // return the new list
        return newList;
}
class Runner {
    public static void main(String[] args) {
        // Get the ArrayList with duplicate values
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

        List<String> list2 = new ArrayList<>(Arrays.asList("swati", "deepti", "raju"));


        // Print the Arraylist
        System.out.println("ArrayList with duplicates: "
                + list);

        // Remove duplicates
        //  ArrayList<Integer>
        // newList = removeDuplicates(list);

        // Print the ArrayList with duplicates removed
        // System.out.println("ArrayList with duplicates removed: "
        //     + newList);
    }
}}

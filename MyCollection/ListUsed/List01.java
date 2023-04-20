package collections.MyCollection.ListUsed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        // Create object for ATB student class and parameterized constructor will be called
        ATBStudent s1 = new ATBStudent(76,"Swati","Java");
        ATBStudent s2 = new ATBStudent(65,"Prashant","Java");
        ATBStudent s3 = new ATBStudent(89,"Lubhani","DataAnalyst");

        // Create List object
        List l1 = new ArrayList();

        l1.add(s1);
        l1.add(s2);
        l1.add(s3);

        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);

    }
}


class ATBStudent implements Comparable<ATBStudent>{
    private Integer id;
    private String name;
    private String coursename;

    public ATBStudent(Integer id, String name, String coursename) {
        this.id = id;
        this.name = name;
        this.coursename = coursename;
    }

    @Override
    public String toString() {
        return "ATBStudent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", coursename='" + coursename + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Override
    public int compareTo(ATBStudent o) {
        return this.coursename.compareTo(o.coursename);
        //return Integer.compare(this.id,o.id);
    }
}

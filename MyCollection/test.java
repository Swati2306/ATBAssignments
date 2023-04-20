package collections.MyCollection;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        System.out.println("enter Employee id and name");
        employee e1 = new employee(sc01.nextInt(), sc01.nextLine());
        //employee e1 = new employee(1,"Swati");
        System.out.println(e1);
    }
}

class employee{

    int Id;
    String name;

    public employee(int id, String name) {
        Id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
package collections.MyCollection.ListUsed;

import java.util.*;

public class ListProb01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        // setting value for student 1
        System.out.println("Enter Student1 name and marks");
        ATBStudent1 s1 = new ATBStudent1(sc01.nextLine(),sc01.nextLine(),sc01.nextLine(),sc01.nextLine());
       /* s1.setName(sc01.nextLine());
        s1.setMathMarks(sc01.nextLine());
        s1.setScrinceMarks(sc01.nextLine());
        s1.setHindiMarks(sc01.nextLine()); */

        // setting value for student 2
        //ATBStudent1 s2 = new ATBStudent1();
        System.out.println("Enter Student2 name and marks");
        ATBStudent1 s2 = new ATBStudent1(sc01.nextLine(),sc01.nextLine(),sc01.nextLine(),sc01.nextLine());
        /*s2.setName(sc01.nextLine());
        s2.setMathMarks(sc01.nextLine());
        s2.setScrinceMarks(sc01.nextLine());
        s2.setHindiMarks(sc01.nextLine());*/

        // setting value for student 3
        //ATBStudent1 s3 = new ATBStudent1();
        System.out.println("Enter Student3 name and marks");
        ATBStudent1 s3 = new ATBStudent1(sc01.nextLine(),sc01.nextLine(),sc01.nextLine(),sc01.nextLine());
        /*s3.setName(sc01.nextLine());
        s3.setMathMarks(sc01.nextLine());
        s3.setScrinceMarks(sc01.nextLine());
        s3.setHindiMarks(sc01.nextLine());*/

        List  l1 = new ArrayList();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);

        System.out.println(l1);
        Collections.sort(l1,new SortByMathMarksDSC());
        System.out.println(l1);

    }
}

class ATBStudent1{
        private String Name;
        private String MathMarks;
        private String ScrinceMarks;
        private String HindiMarks;

    public ATBStudent1(String name, String mathMarks, String scrinceMarks, String hindiMarks) {
        Name = name;
        MathMarks = mathMarks;
        ScrinceMarks = scrinceMarks;
        HindiMarks = hindiMarks;
    }

    @Override
        public String toString() {
            return "ATBStudent1{" +
                    "Name='" + Name + '\'' +
                    ", MathMarks='" + MathMarks + '\'' +
                    ", ScrinceMarks='" + ScrinceMarks + '\'' +
                    ", HindiMarks='" + HindiMarks + '\'' +
                    '}';
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getMathMarks() {
            return MathMarks;
        }

        public void setMathMarks(String mathMarks) {
            MathMarks = mathMarks;
        }

        public String getScrinceMarks() {
            return ScrinceMarks;
        }

        public void setScrinceMarks(String scrinceMarks) {
            ScrinceMarks = scrinceMarks;
        }

        public String getHindiMarks() {
            return HindiMarks;
        }

        public void setHindiMarks(String hindiMarks) {
            HindiMarks = hindiMarks;
        }
    }

class SortByMathMarksASC implements Comparator<ATBStudent1> {

    @Override
    public int compare(ATBStudent1 o1, ATBStudent1 o2) {
        return o1.getMathMarks().compareTo(o2.getMathMarks());
    }
}

class SortByMathMarksDSC implements Comparator<ATBStudent1> {

    @Override
    public int compare(ATBStudent1 o1, ATBStudent1 o2) {
        return o2.getMathMarks().compareTo(o1.getMathMarks());
    }
}






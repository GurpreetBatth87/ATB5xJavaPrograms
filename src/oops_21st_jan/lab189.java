package src.oops_21st_jan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lab189 {
    public static void main(String[] args) {

//            List marks = new ArrayList<>();
//            marks.add(89);
//            marks.add(92);
//            marks.add(56);
//            marks.add(23);
//            Collections.sort(marks);
//            System.out.println(marks);


        student student = new student(20,"batth");
        student student2 = new student(25,"gur");
        student student3 = new student(10,"preet");

    List<student> students= new ArrayList<>();
    students.add(student);
    students.add(student2);
    students.add(student3);
        System.out.println(students);

        //Comparable --> 1 id or name not both are not allowed
        Collections.sort(students);


       // Comparator- ID,name
        //Create a class and implete comparator and tell the Interger.campare, String compare.id ?
        Collections.sort(students,new sort());
        System.out.println(students);



    }



}

package src.oops_21st_jan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab183 {
    public static void main(String[] args) {
        List<String> courseList = new ArrayList<>();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PTB");
        courseList.add("LABTB");

        List numList = new ArrayList();
         numList.add(45);
         numList.add(85);
         numList.add(75);
         numList.add(45);

         courseList.addAll(numList);
        System.out.println(courseList);

        Iterator a = courseList.listIterator();
        while (a.hasNext()){
            System.out.println(a.next());
        }






    }
}

package src.oops_21st_jan;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class lab184 {
    public static void main(String[] args) {
        List<String> tcourseList = new ArrayList<>();
        tcourseList.add("ATB");
        tcourseList.add("MTB");
        tcourseList.add("PTB");
        tcourseList.add("LABTB");


        ListIterator lte = tcourseList.listIterator();
        while (lte.hasNext()){
            System.out.println(lte.next());
        }
        System.out.println("-----------");

        ListIterator lt = tcourseList.listIterator(tcourseList.size());
        while (lt.hasPrevious()){
            System.out.println(lt.previous());
        }

    }
}

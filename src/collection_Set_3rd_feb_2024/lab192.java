package src.collection_Set_3rd_feb_2024;

import java.util.*;

public class lab192 {
    public static void main(String[] args) {
        //Display all the data in random order
        Set courseSet = new HashSet();
        courseSet.add("ATB");
        courseSet.add("PPTB");
        courseSet.add("5xAT");
        courseSet.add("SDET Blueprint");
        courseSet.add("java for tester");

        System.out.println(courseSet);
        System.out.println("_______________");

        //Display the data in shorted order

        Set courseSet1 = new TreeSet();
        courseSet1.add("ATB");
        courseSet1.add("PPTB");
        courseSet1.add("5xAT");
        courseSet1.add("SDET Blueprint");
        courseSet1.add("java for tester");


        System.out.println(courseSet1);
        System.out.println("_______________");

        //Display the data in normal ways first in first print

        Set courseSet2 = new LinkedHashSet();
        courseSet2.add("ATB");
        courseSet2.add("PPTB");
        courseSet2.add("5xAT");
        courseSet2.add("SDET Blueprint");
        courseSet2.add("java for tester");

        System.out.println(courseSet2);
    }
}

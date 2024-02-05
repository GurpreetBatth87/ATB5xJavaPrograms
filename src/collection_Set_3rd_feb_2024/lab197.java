package src.collection_Set_3rd_feb_2024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class lab197 {
    public static void main(String[] args) {
        //Display all the data in random order
        Set <Integer>courseSet = new HashSet();
        courseSet.add(13);
        courseSet.add(78);
        courseSet.add(456);
        courseSet.add(78);
        courseSet.add(78);
        courseSet.add(null);

        System.out.println(courseSet);
        System.out.println("_______________");

        //Display the data in shorted order

        Set <Integer> courseSet1 = new TreeSet();
        courseSet1.add(93);
        courseSet1.add(18);
        courseSet1.add(53);
        courseSet1.add(17);



        System.out.println(courseSet1);
        System.out.println("_______________");

        //Display the data in normal ways first in first print

        Set <Integer>courseSet2 = new LinkedHashSet();
        courseSet2.add(93);
        courseSet2.add(18);
        courseSet2.add(null);
       try {
           courseSet2.add(Integer.valueOf("LinkedHashSet" + null));
       }catch (Exception g ) {
           System.out.println();
       }
        System.out.println(courseSet2);
    }
}

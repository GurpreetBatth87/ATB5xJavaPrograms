package src.collection_Set_3rd_feb_2024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class lab191 {
    public static void main(String[] args) {
        Set courseSet = new HashSet();
        courseSet.add("ATB");
        courseSet.add("PPTB");
        courseSet.add("5xAT");
        courseSet.add("SDET Blueprint");
        courseSet.add("java for tester");
        System.out.println(courseSet);

        for (Object g: courseSet){
            System.out.println(g);
        }
        System.out.println("_____________");
        Iterator it = courseSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

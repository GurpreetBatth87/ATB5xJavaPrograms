package src.oops_21st_jan;

import java.util.Enumeration;
import java.util.Vector;

public class lab185 {
    public static void main(String[] args) {
        Vector<String> v = new Vector ();
        v.add("guru");
        v.add("man");
        v.add("preet");


        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}

package src.oops_21st_jan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lab187_short {
    public static void main(String[] args) {
        List marks = new ArrayList<>();
        marks.add(89);
        marks.add(92);
        marks.add(56);
        marks.add(23);
        Collections.sort(marks);
        System.out.println(marks);
    }
}

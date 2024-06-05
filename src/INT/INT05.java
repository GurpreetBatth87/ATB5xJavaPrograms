package src.INT;

import java.util.Arrays;

public class INT05 {
    public static void main(String[] gur) {
        int a[] = new int[5];
        a[0] = 75;
        a[1] = -33;
        a[2] = 80;
        a[3] = 444;
        a[4] = 66;
        int min = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int max = Integer.MAX_VALUE;
       // System.out.println(Arrays.stream(a)+"fidn");
        for (int i = 0; i < a.length; i++) {
            if(a[i]>min ){
                max2=min;
                min=a[i];
            }

        }
        System.out.println(max2);
    }
}
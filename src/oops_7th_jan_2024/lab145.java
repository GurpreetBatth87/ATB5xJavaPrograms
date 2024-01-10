package src.oops_7th_jan_2024;

import java.util.Scanner;

public class lab145 {
    public static void main(String[] args) {
        //person p = new person();
       // new person();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name -->");
        String name = sc.next();


        person p = new person(name);
        p.details();

        System.out.println("Enter your second name -->");
        String name2 = sc.next();

        person p2 = new person(name2);
        p2.details();

sc.close();

    }
}

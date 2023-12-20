package src.Basic_04_17Dec;

import java.util.Scanner;

public class lab057 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Browser name >> chrome ,firefox ,edge,opera ");
        String browser = sc.next();
        switch (browser.toLowerCase()){
            case "chrome":
                System.out.println("Execute the chrome code");
                break;
            case "firefox":
                System.out.println("Execute the firefox code");
                break;
            case "edge":
                System.out.println("Execute the edge code");
                break;
            case "opera":
                System.out.println("Execute the opera code");
                break;

            default:
                System.out.println("I dont know boss ");

        }

    }
}

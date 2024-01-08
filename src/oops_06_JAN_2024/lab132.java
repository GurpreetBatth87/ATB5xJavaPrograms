package src.oops_06_JAN_2024;

public class lab132 {
    public static void main(String[] args) {

        String s1 = "Gurpreet";
        String s2 = new String("Gurpreet");
        String s3 = new String("gurpreet");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1.equalsIgnoreCase(s3));




    }
}

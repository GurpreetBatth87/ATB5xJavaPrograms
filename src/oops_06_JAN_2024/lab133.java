package src.oops_06_JAN_2024;

public class lab133 {
    public static void main(String[] args) {

        // Immutable in nature(that cant chnaged )
        String s1 = "Gurpreet";
        String s2 = new String("Gurpreet");

        // Mutable --that can chnaged

        StringBuilder sb3 = new StringBuilder("Gurpreet");
        sb3.append(" singh");
        System.out.println(sb3);

        StringBuilder sb = new StringBuilder("Gurpreet");
        sb.append(" batth");
        System.out.println(sb);




    }
}

package src.oops_06_JAN_2024;

public class lab130 {
    public static void main(String[] args) {
        String name = "Gurpreet"; // String Constant pool
        String name2 = new String("Gurpreet Singh"); // Heap /OA Area

        name = "Batth";

        String str1 = "hello";
        // System.out.println(str1.concat("Gurpreet"))
        str1.concat("Gurpreet");
        System.out.println(str1);



    }
}

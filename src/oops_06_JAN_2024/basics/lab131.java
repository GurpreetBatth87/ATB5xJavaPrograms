package src.oops_06_JAN_2024.basics;

public class lab131 {
    public static void main(String[] args) {

        String name = "Gurpreet";
        System.out.println(name.concat("singh"));
        System.out.println(name + " - Singh ");
        System.out.println(name.contains("p"));
        System.out.println(name);

        String name2 = new String("Singh");

        String expected_result = "password@123";
        String actual_result = "Password@123";
        System.out.println(expected_result==actual_result);

        if (expected_result.equalsIgnoreCase(actual_result)){
            System.out.println("___yes___");
        }



    }
}

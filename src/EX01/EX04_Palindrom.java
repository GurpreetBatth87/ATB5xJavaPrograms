package src.EX01;

public class EX04_Palindrom {
    public static void main(String[] args) {
        String name = "Madam";
        String ar = "";

        for (int i=name.length()-1;i>=0;i--){
            ar=ar+name.charAt(i);



        }
        System.out.println(ar);
    }
}

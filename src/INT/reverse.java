package src.INT;

public class reverse {
    public static void main(String[] gurpreet){
        String str = "i love programming very much";
String rev = "";

        for (int i =str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

    }

}

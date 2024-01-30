package src.EX01;

public class EX_Patt_09 {
    public static void main(String[] args) {


        int n = 5;
        int c = 5;
        int l=5;
        for (int i = n;i >=1;i--){
            for(int k = 1; k <=l-i;k++) {
                System.out.print(" ");
            }

            for (int j =i; j >=1;j-- ){


                System.out.print("*");

            }
            System.out.println();
        }
    }
}

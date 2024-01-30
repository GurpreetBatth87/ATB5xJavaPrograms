package src.EX01;

public class EX_Patt_11 {
    public static void main(String[] args) {


        int n = 5;
        int c = 5;
        int l=5;
        for (int i = 1;i <=n;i++){
            for(int k = 1; k <=l-i;k++){
                System.out.print(" ");
            }

            for (int j =1; j <=i;j++ ){


                System.out.print("*" + " ");

            }
            System.out.println();
        }
    }
}

package src.EX01;

public class EX_Patt_07 {
    public static void main(String[] args) {


        int n = 5;
        int c = 5;
        for (int i = 1;i <=n;i++){

            for (int j =1; j <=c-i;j++ ){


                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}

package src.EX01;

public class EX_Patt_04 {
    public static void main(String[] args) {


        int n = 5;
        int c = 5;
        for (int i = 1;i <=n;i++){

            for (int j =1; j <=c-i;j++ ){


                System.out.print(j + "\t");

            }
            System.out.println();
        }
    }
}

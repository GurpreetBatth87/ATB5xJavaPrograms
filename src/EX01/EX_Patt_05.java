package src.EX01;

public class EX_Patt_05 {
    public static void main(String[] args) {


        int n = 4;
        int c = 5;
        int b = 1;
        for (int i = 1;i <=n;i++){

            for (int j =1; j <=i;j++ ){

                System.out.print(b + "  ");
                b++;

            }
            System.out.println();
        }
    }
}

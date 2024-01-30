package src.EX01;

public class EX_Patt_02 {
    public static void main(String[] args) {


        int n = 5;
        int c = 5;

        for (int i = 1;i <=n;i++){
            for (int j =1; j <=c;j++ ){
                if(i==1 || i == n || j== 1 | j==c){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                //System.out.print("*" + " ");

            }
            System.out.println();
        }
    }
}

package src.oops_20th_Jan_2024;

public class Lab170 {
    public static void main(String[] args) throws Exception {
        extracted(0);
        throw new Exception("Gurpreet");
    }

    private static void extracted(int b ) {
//        int a = 0 ;
//        if(b==0){
//            throw new ArithmeticException("B Can't be ZERO");
//        }else {
//         a = 10/b;
//        }
//        System.out.println(a);

        try{
            int a  = 10/b;
             }catch (Exception e){
            System.out.println(e.getMessage());
        }




    }
}

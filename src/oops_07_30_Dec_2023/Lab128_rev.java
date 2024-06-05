package src.oops_07_30_Dec_2023;

public class Lab128_rev {

    public static void main(String[] args) {
//        String name = "Gurpreet";// G U R P R E E T
//        char [] CharArray = name.toCharArray();
//        System.out.println(CharArray.length);
//
//        // o/p -- TEPRUG
//
//        int left = 0 ;
//        int right = CharArray.length-1;
//
//        while(left < right){
//            char temp = CharArray[left];
//            CharArray[left] =CharArray[right];
//            CharArray[right]=temp;
//
//            right--;
//            left ++  ;
//
//        }
//        String rev = new String(CharArray);
//        System.out.println(rev);
//
//

        String name = "i love programming very much";// G U R P R E E T
        char [] C = name.toCharArray();
        System.out.println(C.length);

        // o/p -- TEPRUG

        int leftA = 0 ;
        int rightB = C.length-1;

        while(leftA < rightB){
            char temp = C[leftA];
            C[leftA] =C[rightB];
            C[rightB]=temp;

            rightB--;
            leftA ++  ;

        }
        String rev = new String(C);
        System.out.println(rev);



    }

}



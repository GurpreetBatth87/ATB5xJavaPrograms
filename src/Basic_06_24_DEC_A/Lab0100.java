package src.Basic_06_24_DEC_A;

public class Lab0100 {
    public static void main(String[] args) {

        //Array -- > java
        //Collection data
        //Collection of similar data
        //

        int[] arr1 ={1,2,3,4,5};
        int[] arr2 ={1,2,3,4,5};

        System.out.println(arr1==arr2);

        int[] ar3=arr1;
        System.out.println(arr1==ar3);

        System.out.println(arr1.equals(arr2));
        //if String -->True why -values
        //Arrays -- > compare dont --> ref -not equal

        ar3[0]=24;
        System.out.println(arr1[0]);
        System.out.println(ar3[0]);





    }
}

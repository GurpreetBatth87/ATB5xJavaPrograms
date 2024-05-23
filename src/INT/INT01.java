package src.INT;

public class INT01 {
    public static void main(String[] args) {
      //  How to find higest number from the Array

        int a[]={709,200,89,40,50};

//        for (int i=0;i<=a.length-1;i++){
//            System.out.println(a[i]);
        //}

        int max = a[0];
        for (int i=1;i<=a.length-1;i++){
            if (a[i]>max){
                max =a[i];
            }
        }
        System.out.println("MAX Number is---> "+max);

        int a1[]={70,220,89,40,50};
        int min = a1[0];
        for (int i=1;i<=a.length-1;i++){
            if (a[i]<min){
                min =a[i];
            }
        }
        System.out.println("MiN Number is ---#:) " +min);

    }
}

package src.oops_07_30Dec;

public class Lab112 {
    public static void main(String[] args) {
        //Function

//        int a = 10 ;
//        int b = 20 ;
//        int sum =a+b;
//        System.out.println(sum);
//
//        a=20;
//        b=03;
//        int c= a+b;
//        System.out.println(c);
        int c1 = Gurpreet_sum(); //No argument
        System.out.println(c1);
        int c2 = Gurpreet_sum(3); // 1 argument
        System.out.println(c2);
        int c4 = Gurpreet_sum(3,6,3); // 1 argument
        System.out.println(c4);

       int c = Gurpreet_sum(3,6); // 2 argumrnt
        System.out.println(c);

        saHello();//Call of the function


        }
       static int Gurpreet_sum(int a , int b){//Defination of the function
        return a+b;
        }
    static int Gurpreet_sum(int a){
        return a;
    }
    static int Gurpreet_sum(){
        return 62;
    }
    static int Gurpreet_sum(int a , int b, int c){//Defination of the function
        return a+b+c;
    }

    static void saHello(){
        System.out.println("Hello urpreet ");
    }


    }


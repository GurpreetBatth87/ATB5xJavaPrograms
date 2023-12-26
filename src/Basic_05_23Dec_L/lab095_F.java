    package src.Basic_05_23Dec_L;

    import java.util.Scanner;

    public class lab095_F {
    public static void main(String[] args) {
        // Problem Statement
        // Sum of the digits 5+4+3+2+1=

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        long fact = 0;
        // 5 -- > i =1 to 5 --> fact == fact * 1 , i++
        // A --> int I =1;
        // B --> i <Nu,mber or i<=5
        // c-->i++
        // D -- > fact == fact*i

//        int i =1;
//        while (i<=number){
//            fact =fact*i;
//            i++;
//        }
      //  System.out.println("Fact number is  ---->"+fact);

for(int i = 1 ;i<=number;i++){
    fact = fact+i;
}
        System.out.println("Fact number is  ---->"+fact);
    }
}

    package src.Basic_05_23Dec_L;

    import java.util.Scanner;

    public class lab094 {
    public static void main(String[] args) {
        // Problem Statement
        //Factorial Program
        // 1-->1
        //2---->2*1
        // 3 -- ? 3*2*1
        //4 ---> 4*3*2*1
        //5 ---> 5*4*3*2*1

        //user Input = 5
        //prit == 120

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        long fact = 1;
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
    fact = fact*i;
}
        System.out.println("Fact number is  ---->"+fact);
    }
}

package src.oops_7th_jan_2024;

public class ATBPerson {

        String name ; // instance variables values are defalut value

        int age ;
        long phone;

        String email;
        boolean ismarrid;

        // Default Constructor
        ATBPerson(){
            name = "Guru";
            System.out.println("im DC boss");
        }

        //Pre. -constructor
    ATBPerson(String valufromobjrefrence){
            this.name=valufromobjrefrence;
        System.out.println("Prem Con called");
    }





    void talk(){
        System.out.println("Talk");
    }
    void printdetails(){

        System.out.println(name);
        System.out.println(age);
        System.out.println(phone);
        System.out.println(email);
        System.out.println(ismarrid);

    }

}

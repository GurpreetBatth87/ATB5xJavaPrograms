package src.oops_7th_jan_2024;

public class BankAccout {

    String bankname;

    int balance;

    String bankcode;

    BankAccout(){
        bankname = "SBI";
        bankcode = "SBI10001";
        System.out.println("Default C");
    }

    BankAccout(String bname, String bcode, int bal){
        this.bankname=bname;
        this.balance=bal;
        this.bankcode=bcode;
        System.out.println("pram C");
    }


    void printdetails(){
        System.out.println(this.balance);
        System.out.println(this.bankname);
        System.out.println(this.bankcode);
    }




}

package src.oops_7th_jan_2024.inheritance;

public class Programing {

    int version;
    String author;

    Programing(){
        System.out.println("Programing DC");
    }
    Programing(String auth , int ver){
        this.author =auth;
        this.version=ver;
    }

    void printInfo(){
        System.out.println("Programing info--- "+this.version + " Author --- " +this.author);
    }

    void car(){
        System.out.println("Mahindra");
    }
    void bhk3(){
        System.out.println("BHK3");
    }



}

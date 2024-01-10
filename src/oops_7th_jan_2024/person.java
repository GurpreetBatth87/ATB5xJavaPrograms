package src.oops_7th_jan_2024;

public class person {

    String name;
    person (){
        System.out.println( "this is DC constructor");
    }


   person(String nme){
        this.name=nme;
   }

   void details(){
       System.out.println("your name "+this.name);
   }




}

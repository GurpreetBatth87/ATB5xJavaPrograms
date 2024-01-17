package src.oops_13th_jan_2024;

public class IV {
    public static void main(String[] args) {
        Person h= new Person();
        System.out.println(h.a);

//       Person h2= new Person(23);
//        System.out.println(h2.a);
      Person h3= new Person(23,true);
//        System.out.println(h3.a);
//        System.out.println(h3.b);
        System.out.println(h.b);
        h.a=66;
        System.out.println(h.a);


    }

}
class  Person{
    int a ;
    boolean b;
    //default
    Person(){
        this.a=10;
    }
    // perrameter constructor
    Person(int b){
        this.a = b;//h2.a
    }
    Person(int b ,boolean a ){
        this.a=b;
        this.b=a;
    }



        }

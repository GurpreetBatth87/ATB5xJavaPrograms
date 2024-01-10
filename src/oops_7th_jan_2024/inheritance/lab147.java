package src.oops_7th_jan_2024.inheritance;

public class lab147 {
    public static void main(String[] args) {

//Programing p  = new Programing();
    // java j = new java();
       // Programing p  = new java();
       // java j2 = new Programing();
//        java j =new java();
//        j.car();
//        j.bhk3();
//        j.author ="gurpreet";

        python p1 = new python();
        p1.bhk3();

    }

    public static class java extends Programing {
        String newfeature;

        java(){
            System.out.println("JAVA Dc");
        }
        java(String feature){
            this.newfeature=feature;
        }

        void printinfo(){
            System.out.println("Feature is __>"+this.newfeature);
        }



        }
}

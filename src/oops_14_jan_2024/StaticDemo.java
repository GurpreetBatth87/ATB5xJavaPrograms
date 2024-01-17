package src.oops_14_jan_2024;

public class StaticDemo {
    public static String collage_name="TheTestingAcademy";

    //non ststic vaible -->local variable or Instance variable

    public int version =3;

    //Static method

    public static void printname(){
        int a =20;
        System.out.println("Name is " + collage_name);
        //you can't have a Instance variable into the static method!!
        //System.out.println("version"+version);
    }
    public void Prntversion(){
        int a =20;
        System.out.println("Verion is" +version);
        System.out.println("name is" +collage_name);
    }
}

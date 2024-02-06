package src.collection_Set_3rd_feb_2024;

public class lab201 {
    public static void main(String[] args) {
        //java -- > non generic

temp("pramod");
temp(123);
temp(false);
    }

    public static<T> void temp(T x){
        System.out.println(x);
    }
}

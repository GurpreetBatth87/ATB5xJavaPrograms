package src.oops_14_jan_2024.InnerClass;

public class lab153 {
    public static void main(String[] args) {
        OCC occ = new OCC();
        OCC.SNCI ref = new OCC.SNCI();
        ref.show();
    }

}

class OCC{
    static int o = 100;

    int a = 900;

    static class SNCI{
        void show(){
            //System.out.println(a);
            System.out.println(o);
        }
    }
}

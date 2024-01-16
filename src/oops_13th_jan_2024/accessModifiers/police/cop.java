package src.oops_13th_jan_2024.accessModifiers.police;

public class cop {
    public int gun;
    //modifier return name_Variable

     public cop(int gun){
        this.gun=gun;
    }
    protected void canIShoot(){
        System.out.println("of-course Shoot");
    }
}

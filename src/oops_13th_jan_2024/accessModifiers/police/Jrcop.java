package src.oops_13th_jan_2024.accessModifiers.police;

public class Jrcop {
    public static void main(String[] args) {
        cop jrcop= new cop(2);
        System.out.println(jrcop.gun);
        jrcop.canIShoot();
    }
}

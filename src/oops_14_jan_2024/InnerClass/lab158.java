package src.oops_14_jan_2024.InnerClass;

public class lab158 {
    public static void main(String[] args) {
//        parent p = new parent();
//        sun c = new sun();
//        p = c;

Hello hello = new child2();
child2 c = (child2) hello;//Downcastig in class

    }

}

class Hello {}

class child2 extends Hello{}



























//upcastig and downcasting in class

class parent {}

class sun extends parent{}
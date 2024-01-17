package src.oops_14_jan_2024.IV;

public class abstract01 {
    public static void main(String[] args) {

    }

}
abstract class per{
    abstract void say();

    void eat(){
        System.out.println("hello eat from person");
    }
}

abstract class student extends per{

}
class gur extends student{

    @Override
    void say() {

    }
}

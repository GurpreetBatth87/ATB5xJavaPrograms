package src.oops_13th_jan_2024.abstraction.interfaces.IVQ;

public class Lab149 {
    public static void main(String[] args) {

    }
}
interface I1{}
interface I2{}
class A{}

class B{}

abstract class c{}
abstract class D{}

    class  Test1 extends A{ } //0K
//class Test2 extends A,B{ } //Not OK
class Test3 implements I1{ }//0K
class Test4 implements I1,I2{ }//0K
class Test5 extends A implements I1,I2{ }//OK
//class Test6 implements I1 extends A{ } / /Not OK

//interface I3 extends A{}
//interface I4 implements A{}
//interface I5 extends A,B{}
interface I6 extends I1,I2{ }

package src.oops_14_jan_2024.InnerClass;

public class lab155 {
    public static void main(String[] args) {
        student s1 = new student() {
            @Override
            public void setID() {

            }
        };
        s1.setID();

        B b = new B() {
            // this is a Anoy classc
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };

    }

}
abstract class B{
    int b = 12;

}

interface student{
    int i = 44;
    void setID();
}

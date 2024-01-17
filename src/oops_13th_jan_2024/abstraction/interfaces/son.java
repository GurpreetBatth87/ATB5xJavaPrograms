package src.oops_13th_jan_2024.abstraction.interfaces;

public class son implements Father {
    @Override
    public void loan1k() {
        Father.prnt2();
        System.out.println("will give Loan");
    }
}

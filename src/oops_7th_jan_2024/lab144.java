package src.oops_7th_jan_2024;

public class lab144 {
    public static void main(String[] args) {
        BankAccout sbiRef = new BankAccout();
        sbiRef.printdetails();
        System.out.println("_______________");

        BankAccout HDFCref = new BankAccout("HDFC","HDFC4562",78);
        HDFCref.printdetails();

        System.out.println("_______________");

        BankAccout icicref = new BankAccout("icic","ICC01345",100);
        icicref.bankcode="GUR8569";
        icicref.printdetails();









    }
}

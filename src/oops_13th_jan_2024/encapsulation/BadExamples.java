package src.oops_13th_jan_2024.encapsulation;

public class BadExamples {
    public static void main(String[] args) {

        vwologin vwologin = new vwologin("admi","admin");
        //admin and admin

        boolean check= vwologin.isLogedin("admin" , "password");
       vwologin.setUseername("Admin");

        System.out.println("--- "+vwologin.getPassword());
        boolean check2= vwologin.isLogedin("admi" , "password");

        System.out.println(check2);

    }


}

class vwologin{
    private String useername;

    public String getUseername() {
        return useername;
    }

    public void setUseername(String useername) {
        this.useername = useername;
    }

    public String getPassword() {
        return password;
    }

    private String password;


    public vwologin(String useername, String password) {
        this.useername = useername;
        this.password = password;
    }

    boolean isLogedin(String useername, String password){
        if (this.useername.toLowerCase().equals(useername)&& this.password.toLowerCase().equals(password)){
            System.out.println("Logged In");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }


}

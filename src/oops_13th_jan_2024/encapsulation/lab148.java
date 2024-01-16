package src.oops_13th_jan_2024.encapsulation;

public class lab148 {
    public static void main(String[] args) {


        wvologinFixed vwologin = new wvologinFixed("admin", "admin");

        boolean check = vwologin.isLogedin("admin", "password");
        String u = vwologin.getUsername();
//        vwologin.getpasswod();
        System.out.println(u);
        System.out.println(check);
    }
}

class wvologinFixed{
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    private String password;

    public wvologinFixed(String u, String p) {
        this.username = u;
        this.password = p;
    }

    boolean isLogedin(String useername, String password){
        if (this.username.toLowerCase().equals(useername)&& this.password.toLowerCase().equals(password)){
            System.out.println("Logged In");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }




}

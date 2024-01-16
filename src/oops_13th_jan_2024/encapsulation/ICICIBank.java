package src.oops_13th_jan_2024.encapsulation;

public class ICICIBank {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        if (bal > 0) {
            this.bal = bal;
        }else {
            System.out.println("not allowed");
        }
    }

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    String name ;

    long bal;
}

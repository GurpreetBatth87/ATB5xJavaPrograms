package src.oops_20th_Jan_2024;

public class hello {
    public static void main(String[] args) throws Exception {
        H h = new H();
        h.process();


    }
}

    class H{
        public int process() throws Exception{
            int a = 10 /0;
            throw new NullPointerException();
           // return 0;
        }

}

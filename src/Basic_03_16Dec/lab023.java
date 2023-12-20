package src.Basic_03_16Dec;

public class lab023 {
    public static void main(String[] args) {
        //Logical Operators --- > || - or
        // Ex --> : ! , && , ||
        // gates gates
        // || - OR
        // T || T --> T
        // T || F --> T
        // F || T --> T
        // T || T --> F
        System.out.println( true || true);
        System.out.println( true || false);
        System.out.println( false || true);
        System.out.println( false || false);
        System.out.println("**********************");

        // && - AND
        // T || T --> T
        // T || F --> F
        // F || T --> F
        // T || T --> F

        System.out.println( true && true);
        System.out.println( true && false);
        System.out.println( false && true);
        System.out.println( false && false);

    }
}

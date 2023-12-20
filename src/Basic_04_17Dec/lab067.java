package src.Basic_04_17Dec;

public class lab067 {
    public static void main(String[] args) {
        int code = 12;
        int val = switch (code) {
            case 12:
                yield 1;
            case 34:
                yield 2;
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
}

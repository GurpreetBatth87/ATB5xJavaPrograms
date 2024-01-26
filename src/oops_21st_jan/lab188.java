package src.oops_21st_jan;

import java.util.Stack;

public class lab188 {
    public static void main(String[] args) {
        //stack
        Stack stack = new Stack<>();
        stack.add("A");
        stack.add("B");
        stack.add("C");
        stack.add("D");

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}

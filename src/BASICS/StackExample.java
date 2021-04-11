package BASICS;

// stack is also in the Java Collection framework.
// The stack is based on the basic principle - FIRST IN FIRST OUR
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("first");
        System.out.println(stack);
        stack.push("second");
        System.out.println(stack);
        stack.push("third");
        System.out.println(stack);
       // stack.push("fourth");

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.capacity());
    }
}

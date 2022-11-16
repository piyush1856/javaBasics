package sprint4Day4Live;

import java.util.Stack;

public class _4Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //since its is part of collection everyMethod is part of it

        stack.add(0);
        stack.push(5); // it internally calls add method
        stack.push(6);
        //stack.clear();
        stack.peek(); //return the top item without removing ir
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);

        stack.remove(0); //don't use in stack

        System.out.println(stack.elementAt(0));

        //EmptyStackException -- stack under flow -- empty stack
    }
}

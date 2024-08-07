import java.util.*;

public class Stack_Implementation {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack after pushing elements: " + stack);

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element is: " + stack.pop());

        System.out.println("Stack after popping an element: " + stack);

        System.out.println("Is the stack empty? " + stack.isEmpty());

        int position = stack.search(2);
        if (position != -1) {
            System.out.println("Element 2 is found at position: " + position);
        } else {
            System.out.println("Element 2 is not found in the stack.");
        }

        stack.pop();
        System.out.println("Stack after another pop operation: " + stack);

        System.out.println("Is the stack empty now? " + stack.isEmpty());
    }
}

import java.util.*;

public class Display_Stack {

    public static void displayUsingAnotherStack(Stack<Integer> st) {
        Stack<Integer> st2 = new Stack<>();
        while (!st.isEmpty()) {
            st2.push(st.pop());
        }
        while (!st2.isEmpty()) {
            int x = st2.pop();
            System.out.print(x + " ");
            st.push(x);
        }
        System.out.println();
    }

    public static void displayUsingArray(Stack<Integer> st) {
        int n = st.size();
        int[] arr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }
        System.out.println();
    }

    public static void displayUsingRecursion(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        displayUsingRecursion(st);
        System.out.print(top + " ");
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose display method: 1. Another Stack 2. Array 3. Recursion");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                displayUsingAnotherStack(st);
                break;
            case 2:
                displayUsingArray(st);
                break;
            case 3:
                displayUsingRecursion(st);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

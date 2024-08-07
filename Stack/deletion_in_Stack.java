import java.util.*;

public class deletion_in_Stack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack: " + st);

        int idx = 2;

        deleteAt(st, idx);

        System.out.println("Stack after deletion: " + st);
    }

    public static void deleteAt(Stack<Integer> st, int idx) {
        Stack<Integer> temp = new Stack<>();
        while (st.size() > idx + 1) {
            temp.push(st.pop());
        }

        if (!st.isEmpty()) {
            st.pop(); // Remove the element at the specified index
        }

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }
}

import java.util.*;

public class insertion_in_Stack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack: " + st);

        int idx = 2;
        int x = 7;

        insertAt(st, idx, x);

        System.out.println("Stack after insertion: " + st);
    }

    public static void insertAt(Stack<Integer> st, int idx, int x) {
        Stack<Integer> temp = new Stack<>();
        while (st.size() > idx) {
            temp.push(st.pop());
        }
        st.push(x);

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }
}

public class arrayImplementation_Stack {

    public static class Stack {
        private int[] arr = new int[10];
        private int idx = 0;

        void push(int x) {
            if (idx >= arr.length) {
                System.out.println("Stack is full. Cannot push " + x);
                return;
            }
            arr[idx] = x;
            idx++;
            System.out.println("Pushed " + x + " onto the stack.");
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack is empty.");
                return -1;
            }
            int top = arr[idx - 1];
            System.out.println("Top element is " + top);
            return top;
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Stack is empty. Cannot pop.");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            System.out.println("Popped " + top + " from the stack.");
            return top;
        }

        void display() {
            System.out.print("Stack elements: ");
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            System.out.println("Stack size is " + idx);
            return idx;
        }

        boolean isEmpty() {
            boolean empty = (idx == 0);
            System.out.println("Stack is " + (empty ? "empty" : "not empty"));
            return empty;
        }

        boolean isFull() {
            boolean full = (idx >= arr.length);
            System.out.println("Stack is " + (full ? "full" : "not full"));
            return full;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.display();
        st.peek();
        st.pop();
        st.display();
        st.size();
        st.isEmpty();
        st.isFull();

        st.push(6);
        st.display();
        st.size();
        st.isEmpty();
        st.isFull();
    }
}

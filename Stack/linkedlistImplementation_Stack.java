public class linkedlistImplementation_Stack {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; // Initialize the next field
        }
    }

    public static class Stack {
        Node head = null;
        int size = 0;

        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

        boolean isEmpty() {
            return size == 0;
        }

        int size() {
            return size;
        }

        void displayrec(Node h) {
            if (h == null) {
                return;
            }
            displayrec(h.next);
            System.out.print(h.data + " ");
        }

        void display() {
            displayrec(head);
            System.out.println();
        }

        void displayRev() { // this will print reverse Stack
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
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
        System.out.println("Peek: " + st.peek());
        System.out.println("Popped: " + st.pop());
        st.display();
        System.out.println("Size: " + st.size());
        System.out.println("Is Empty: " + st.isEmpty());

        st.push(6);
        st.display();
        System.out.println("Size: " + st.size());
        System.out.println("Is Empty: " + st.isEmpty());
    }
}

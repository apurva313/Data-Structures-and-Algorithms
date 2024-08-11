import java.util.Stack;

class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {}

    public void push(int val) {
        st.push(val);
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        } else {
            min.push(min.peek());
        }
    }

    public void pop() {
        st.pop();
        min.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(5);
        System.out.println("Pushed 5");
        System.out.println("Top element: " + obj.top());
        System.out.println("Minimum element: " + obj.getMin());

        obj.push(3);
        System.out.println("Pushed 3");
        System.out.println("Top element: " + obj.top());
        System.out.println("Minimum element: " + obj.getMin());

        obj.push(7);
        System.out.println("Pushed 7");
        System.out.println("Top element: " + obj.top());
        System.out.println("Minimum element: " + obj.getMin());

        obj.push(2);
        System.out.println("Pushed 2");
        System.out.println("Top element: " + obj.top());
        System.out.println("Minimum element: " + obj.getMin());

        obj.pop();
        System.out.println("Popped");
        System.out.println("Top element: " + obj.top());
        System.out.println("Minimum element: " + obj.getMin());
    }
}

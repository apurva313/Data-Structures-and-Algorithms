import java.util.Stack;

public class nextGreaterElement_Stack {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] result = getNextGreaterElement(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] getNextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.empty() && arr[i] >= stack.peek()) {
                stack.pop();
            }
            result[i] = stack.empty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        return result;
    }
}

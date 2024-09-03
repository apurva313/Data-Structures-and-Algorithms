public class arrayImplementation_Queue {

    public static class QueueA {
        private int f = -1; // front
        private int r = -1; // rear
        private int size = 0;
        private int[] arr = new int[5];

        public void add(int val) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (isEmpty()) {
                f = r = 0;
            } else {
                r = (r + 1) % arr.length;
            }
            arr[r] = val;
            size++;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = arr[f];
            if (f == r) {
                f = r = -1;
            } else {
                f = (f + 1) % arr.length; // Circular increment is best for increment/decremenet
            }
            size--;
            return x;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }

        public int size() {
            return size;
        }

        public boolean isFull() {
            return size == arr.length;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return;
            }
        
            int i = f;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == r) {
                    break;
                }
                i = (i + 1) % arr.length;
            }
            System.out.println();
        }
        
        
    }

    public static void main(String[] args) {
        QueueA queue = new QueueA();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        queue.display();

        System.out.println("Peek: " + queue.peek()); 
        System.out.println("Remove: " + queue.remove());
        System.out.println("Peek after remove: " + queue.peek()); 

        queue.add(60); // This should print "Queue is full" if the queue is full
        queue.display();

        System.out.println("Is full: " + queue.isFull()); 
        System.out.println("Is empty: " + queue.isEmpty()); 

        System.out.println("Queue size: " + queue.size()); 

        queue.remove(); 
        queue.remove();
        queue.remove(); 
        queue.remove(); 
        queue.remove();

        queue.display();

        System.out.println("Is empty after all removes: " + queue.isEmpty()); 
    }
}

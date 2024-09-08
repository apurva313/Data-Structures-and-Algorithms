public class circularQueueArray {

    public static class Cqa {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[8];

        public void add(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is Full!");
            } else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            } else if (rear < arr.length - 1) {
                arr[++rear] = val;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            }
            int val = arr[front];
            arr[front] = 0;
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % arr.length;
            }
            size--;
            return val;
        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            }
            return arr[front];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == arr.length;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return;
            }

            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) {
                    break;
                }
                i = (i + 1) % arr.length;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            Cqa queue = new Cqa();

            queue.add(10);
            queue.add(20);
            queue.add(30);
            queue.add(40);
            queue.add(50);
            queue.add(60);
            queue.add(70);
            queue.add(80);

            queue.display();

            System.out.println("Removed: " + queue.remove());
            System.out.println("Removed: " + queue.remove());

            queue.display();

            queue.add(90);
            queue.add(100);

            queue.display();

            System.out.println("Peek: " + queue.peek());

            //actual array look like this -> 90 100 30 40 50 60 70 80
            for(int i=0; i<queue.arr.length; i++){
                System.out.print(queue.arr[i]+" ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

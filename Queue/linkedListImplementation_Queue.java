public class linkedListImplementation_Queue {
    public static class Node{
        int val;
        Node next;
        
        public Node(int data) {
            this.val = data;
            this.next = null; 
        }
    }
    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size=0;

        public void add(int x){
            Node temp = new Node(x);
            if(size==0){
                head=tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
            size++;     
        }

        public  int remove(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }

            int x=head.val;
            head=head.next;
            size--;

            return x;
        }

        public  int peek(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.val;
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }

    }
    public static void main(String[] args) {
        queueLL q=new queueLL();

        q.display();
        System.out.println(q.isEmpty());
        q.add(0);
        q.add(1);
        q.add(3);
        q.add(4);

        q.display();

        System.out.println("pop() is: "+q.remove());

        q.display();

        q.add(0);
        q.add(1);

        System.out.println("peek() is: "+q.peek());


        q.display();
    }
}

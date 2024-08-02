public class Implementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class linkedlist{
        Node head=null;
        Node tail=null;

        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
         void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
         int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        void insertAtStart(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

        void insertAt(int idx, int val){
            Node t=new Node(val); //assign the val in t
            Node temp=head; //for moving 
            if(idx==size()){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtStart(val);
                return;
            }
            else if(idx<0 || idx>size()){
                System.out.println("Wrong Index!");
                return;
            }
            for(int i=1; i<=idx-1; i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        int getAt(int idx){
            if(idx<0 || idx>size()){
                System.out.println("Wrong Index!");
                return -1;
            }

            Node temp=head;
            for(int i=1; i<=idx; i++){
                temp=temp.next;
            }
            return temp.data;
        }
    
    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(1);
        ll.display();

        ll.insertAtEnd(2);
        ll.display();

        ll.insertAtEnd(3);
        ll.display();

        ll.insertAtStart(10);
        ll.display();

        ll.insertAt(2, 25);
        ll.display();
        
        System.out.println(ll.getAt(2));
    }
}

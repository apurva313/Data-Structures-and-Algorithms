//package Linked List;

public class reverseList {

    public static void display(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }

    public static void displayrev(Node head){
        if(head==null) return;
        displayrev(head.next);
        System.out.print(head.data+" ");
    }

    public static Node reverse(Node head){ // The time Complexity is O(n)
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static Node reverse2(Node head){ // The time Complexity is O(1)
       Node curr=head;
       Node prev=null;
       Node Next=null;

       while(curr!=null){
        Next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=Next;
       }
        return prev;
    }



    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(30);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.print("Original LL: ");
        display(a); 
        System.out.print("\nReverse LL: ");
        // a = reverse(a);
        a= reverse2(a);
        display(a);
    }
}

//package Linked List;
// The time Complexity is O(n)

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

    public static Node reverse(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
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
        a = reverse(a);
        display(a);
    }
}

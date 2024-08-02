//package Linked List;

public class basicll {

    public static void display(Node head){
        
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void displayr(Node head){
        
        if(head==null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }

    public static void displayrev(Node head){
        
        if(head==null) return;
        displayr(head.next);
        System.out.print(head.data+" ");
    }

    public static int lengthCount(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }



    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(15);
        Node d=new Node(20);
        Node e=new Node(30);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

      display(a); 
      System.out.println();
      displayr(a);
      System.out.println();
      System.out.println(lengthCount(a));
      System.out.println("Reverse LL: ");
      displayrev(a);
    }
}

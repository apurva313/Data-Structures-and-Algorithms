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

    }
}

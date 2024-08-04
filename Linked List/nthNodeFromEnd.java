import java.util.*;

public class nthNodeFromEnd {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static Node nthNode(Node head, int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size - n + 1;
        //mth node from start se
        temp=head;
        for(int i=0; i<m-1; i++){
            temp=temp.next;
        }
        return temp;
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

        // 5 -> 10 -> 15 -> 20 -> 30

        Node q=nthNode(a, 3);
        System.out.println(q.data);
    }
}

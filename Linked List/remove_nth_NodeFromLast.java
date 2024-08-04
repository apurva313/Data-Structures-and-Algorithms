import java.util.*;

public class remove_nth_NodeFromLast {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void nthNode(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if (fast == null)
            return ;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        // return head;
    }

    public static void display(Node head){
        
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
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

        // 5 -> 10 -> 15 -> 20 -> 30

       
        display(a);
        nthNode(a, 1);
        display(a);
     }
}

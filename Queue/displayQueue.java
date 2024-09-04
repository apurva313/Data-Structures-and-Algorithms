import java.util.*;

public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> h= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        //System.out.println(q);
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            h.add(q.remove());
        }
        // System.out.println(q);
        // System.out.println(h);
        while(h.size()>0){
            q.add(h.remove());
        }
    }
}

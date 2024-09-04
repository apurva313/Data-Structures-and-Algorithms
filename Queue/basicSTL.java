import java.util.*;

public class basicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        System.out.println(q.isEmpty());

        q.add(1);
        System.out.println(q.isEmpty());

        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.size());
        System.out.println(q);

        q.remove();

        System.out.println(q.size());
        System.out.println(q);

        q.poll();

        System.out.println(q.size());
        System.out.println(q);
    }
}

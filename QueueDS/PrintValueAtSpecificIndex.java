package QueueDS;

import java.util.LinkedList;
import java.util.Queue;

public class TraversalInQueue {
    public static void display(Queue<Integer> q){
        for(int i= 0; i<q.size(); i++) {
            System.out.print(q.peek()+ " ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        display(q);
        peekAtIndex(q, 4);
    }

    private static void peekAtIndex(Queue<Integer> q, int idx) {
        int n = q.size();
        if(idx < 0 || idx >= n) {
            System.out.println("Invalid Index");
        }
        else {
            int i;
            for(i = 0; i<idx; i++) {
                q.add(q.remove());
            }
            System.out.println(q.peek());
            for(; i<n; i++) {
                q.add(q.remove());
            }
        }
    }
}

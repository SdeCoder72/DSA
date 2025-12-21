package QueueDS;

import java.util.LinkedList;
import java.util.Queue;

public class AddValueInQueue {
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
    }
  private static void addAtIndex(Queue<Integer> q, int val, int idx) {
        int n = q.size();
        if(idx < 0 || idx > n) {
            System.out.println("Invalid Index");
        }
        else if(idx == n) {
            q.add(val);
        }
        else {
            int i;
            for(i = 0; i<idx; i++) {
                q.add(q.remove());
            }
            q.add(val);
            for(; i<n; i++) {
                q.add(q.remove());
            }
        }
    }
   
}

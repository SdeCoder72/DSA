package QueueDS;
import java.util.*;
import java.util.Queue;

/*
Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
Output: [-8, 0, -6, -6]
 */
public class FirstNegativeInEveryWindowOfSizeK {
    static List<Integer> firstNegInt(int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int i = 0;
        int n = arr.length;
        for(int j = 0; j<n; j++) {
            // -ve value found
            if(arr[j] < 0) q.add(arr[j]);
            // window length
            if(j-i+1 == k) {
                if(!q.isEmpty()) ans.add(q.peek());
                else ans.add(0);
                // removing -ve values from the queue
                if(arr[i] < 0 && !q.isEmpty()) q.remove();
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(firstNegInt(arr, k));  // -8, 0, -6, -6
        int[] arr2 = {12, -1, -7, 8, -15, 30, 16, 28};
        System.out.println(firstNegInt(arr2, 3));  // -1, -1, -7, -15, -15, 0
        int[] arr3 = {12, 1, 3, 5};
        System.out.println(firstNegInt(arr3, 3));  // 0, 0

    }
}



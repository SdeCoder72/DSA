// Time Complexity - O(n)
// Space Complexity - O(n)

class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cost = 0;
        for(int ele : arr) {
            pq.add(ele);
        }
        while(pq.size() != 1) {
            int sum = pq.remove() + pq.remove();
            cost += sum;
            pq.add(sum);
        }
        return cost;
    }
}

// Missing element in range (gfg)
// Approach - 1
// Time Complexity - O(n + (high-low+1) )
// Space Complexity - O(n)
class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int e : arr) set.add(e);
        for(int i = low; i<= high; i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}

// Approach - 2
// Time Complexity - O(n + (high-low+1) )
// Space Complexity - O(1)
class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int[] a = new int[high-low+1];
        for(int e : arr) {
            if(e >= low && e <= high) a[e-low] = 1;
        }
        for(int i = low; i<= high; i++){
            if(a[i-low] == 0) ans.add(i);
        }
        return ans;
    }
}


// T.C - O(n)
// A.S - 0(1)
// 2 pass solution 
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        // find minimum difference 
        int minDiff = Integer.MAX_VALUE;
        for(int i = 1; i<n; i++){
            minDiff= Math.min(minDiff, arr[i] - arr[i-1]);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i<n; i++){
            if(arr[i]-arr[i-1] == minDiff) {
                List<Integer> append = new ArrayList<>();
                append.add(arr[i-1]);
                append.add(arr[i]);
                ans.add(append);
            }
        }
        return ans;
    }
}

Time complexity - O(n)
Space complexity - O(n) recursion stack

class Solution {
    public boolean canReach(int[] arr, int start) {
        if(start<0 || start >= arr.length || arr[start] < 0) return false;
        if(arr[start] == 0) return true;
        arr[start] *= -1;
        boolean r = canReach(arr, start + arr[start]);
        boolean l = canReach(arr, start - arr[start]);
        return r || l;
    }
}

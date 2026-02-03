// Time Complexity - O(n )
// Space Complexity - O(n)
class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int e : arr){
            int rem = target - e;
            if(set.contains(rem)) return true;
            set.add(e);
        }
        return false;
    }
}

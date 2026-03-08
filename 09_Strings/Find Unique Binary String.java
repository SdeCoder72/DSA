// Approach - 1 (Brute force:Decimal set approach)
// Time Complexity - O(n²)
// Space Complexity - O(n)
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(String s : nums) {
            set.add(Integer.parseInt(s, 2));
        }
        for(int i = 0; i<=n; i++) {
            if(!set.contains(i)){
                String binary = Integer.toBinaryString(i);
                while(binary.length() < n) binary = "0" + binary;
                return binary;
            }
            
        }
        return "";
    }
}

// Approach - 2 (Optimal: Cantor's diagonal argument)
// Time Complexity - O(n)
// Space Complexity - O(n)
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        int n = nums.length;
        for(int i = 0; i<n; i++) {
            ans.append(nums[i].charAt(i) == '1' ? '0' : '1');
        }
        return ans.toString();
    }
}

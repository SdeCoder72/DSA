// Time Complexity - O(k), k = right - left + 1
// Space Complexity - O(1);

class Solution {
    public int countPrimeSetBits(int left, int right) {
        HashSet<Integer> set = new HashSet<>();
        Collections.addAll(set, 2,3,5,7,11,13,17,19);
        int ans = 0;
        for(int i = left; i<=right; i++){
            int count = Integer.bitCount(i);
            if(set.contains(count)) ans++;
        }
        return ans;
    }
}

// Time complexity - O(n * log10(num) + m * log10(num))
// Space complexity - number of all possible prefixes

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> st = new HashSet<>();
        for(int num : arr1){
            while(!st.contains(num) && num > 0){
                st.add(num);
                num /= 10;
            }
        }
        int result = 0;
        for(int num : arr2){
            while(!st.contains(num) && num > 0){
                num /= 10;
            }
            if(num > 0) result = Math.max(result, (int) Math.log10(num)+1);
        }
        return result;
    }
}

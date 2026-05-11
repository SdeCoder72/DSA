// Time complexity - O(n * log10n)
// Space complexity - O(n)
class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        for (int num : nums) {
            List<Integer> temp = new ArrayList<>();
            // Extract digits from the number from right to left
            while (num != 0) {
                temp.add(num % 10);
                num /= 10;
            }
            
            // Add temp list to final 'ans' list in reverse order
            for (int i = temp.size() - 1; i >= 0; i--) {
                ans.add(temp.get(i));
            }
        }
        
        // Convert the final list into a primitive int array
        int[] ansArr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ansArr[i] = ans.get(i);
        }
        
        return ansArr;
    }
}

// Time complexity - O(n)
// Space complexity - O(n)

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int count = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] result = new int[n];
        for(int i = 0; i<n; i++){
            mp.put(A[i], mp.getOrDefault(A[i], 0)+1);
            if(mp.get(A[i]) == 2) count++;
            mp.put(B[i], mp.getOrDefault(B[i], 0)+1);
            if(mp.get(B[i]) == 2) count++;
            result[i] = count;
        }
        return result;
    }
}

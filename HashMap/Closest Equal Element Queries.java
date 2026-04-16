// Time complexity - O(n log n)
// Space complexity - O(n)

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        Map<Integer, List<Integer>> mp = new HashMap<>();

        // Preprocess: Group indices of the same number
        for (int i = 0; i < n; i++) {
            mp.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> result = new ArrayList<>();

        for (int q : queries) {
            int ele = nums[q];
            List<Integer> idxList = mp.get(ele);
            int size = idxList.size();

            if (size == 1) {
                result.add(-1);
                continue;
            }

            int res = Integer.MAX_VALUE;
            int position = Collections.binarySearch(idxList, q);
          
            for (int i = 0; i < 3; i += 2) {
                int j = i - 1;
                int actualIdx = idxList.get((position + j + size) % size);

                int d = Math.abs(q - actualIdx);
                res = Math.min(res, Math.min(d, n - d));
            }
            result.add(res);
        }
        return result;
    }
}

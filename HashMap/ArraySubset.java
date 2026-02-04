// Time Complexity - O(n+m)   n = a.length, m = b.length
// Space Complexity - O(n)   Using HashMap DS
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int e : a) map.put(e, map.getOrDefault(e, 0) + 1);
        for(int e : b) {
            map.put(e, map.getOrDefault(e, 0) - 1);
            if(map.get(e) < 0) return false;
        }
        return true;
    }
}

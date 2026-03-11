// Time Complexity - O(1)
// Space Complexity - O(1)

class Solution {
    static List<Integer> get(int a, int b) {
        List<Integer> l = new ArrayList<>();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        l.add(a);
        l.add(b);
        return l;
    }
}

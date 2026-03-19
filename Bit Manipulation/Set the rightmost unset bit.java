// Time Complexity - O(1)
//Space Complexity - O(1)
class Solution {
    static int setBit(int n) {
        // code here
        return (n | n+1);
    }
}

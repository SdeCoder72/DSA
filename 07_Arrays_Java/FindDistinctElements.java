
// Approach - 1
// Time Complexity - O(n)
// Space Complexity - O(n)

class Solution {
    static int distinct(int arr[]) {
        // code here
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
           set.add(arr[i]);
        }
        return set.size();
    }
}

// Approach - 2
// Time Complexity - O(n)
// Space Complexity - O(n)
class Solution {
    static int distinct(int arr[]) {
        // code here
         HashSet<Integer> set = new HashSet<>();
         for(int e : arr) set.add(e);
         return set.size();
    }
}

// Approach - 3
// Time Complexity - O(n log n)
// Space Complexity - O(1)
class Solution {
    static int distinct(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count = 1;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] != arr[i+1]) count++;
        }
        return count;
    }
}

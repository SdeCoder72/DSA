//Approach - 01 (data type conversion)
// Time complexity - O(n log n)
// Space complexity - O(1)

class Solution {
    public boolean asteroidsDestroyed(int m, int[] asteroids) {
        long mass = (long) m;
        Arrays.sort(asteroids);
        for(int a : asteroids){
            if(mass < a) return false;
            mass += a;
        }
        return true;
    }
}

//Approach - 02 (without data type conversion)
// Time complexity - O(n log n)
// Space complexity - O(1)

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        for(int a : asteroids){
            if(mass < a) return false;
            if(mass >= 1e5) return true;
            mass += a;
        }
        return true;
    }
}

package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i<arr1.length; i++) {
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the 2nd  string: ");
        String s2 = sc.nextLine();

        System.out.println(isAnagram(s1, s2));


    }
}

// Approach - 2 (Using HashMap
// Time Complexity - O(m + n)
// Space Complexity - O(n)

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)-1);
            if(map.get(ch) < 0) return false;
            else if(map.get(ch) == 0) map.remove(ch);
        }
        return (!map.isEmpty()) ? false : true;
    }
}

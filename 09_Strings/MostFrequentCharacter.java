package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
 // Approach -1(Using fixed size array)
        int n = s.length();
        int[] arr = new int[26];
        for(int i= 0; i<n; i++) {
            char ch = s.charAt(i);
            int idx = ch - 97;
            arr[idx]++;
        }

        int max = 0;
        char ans = s.charAt(0);
        for(int i = 0; i<26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ans = (char)(i+97);
            }
        }
        System.out.println(ans);

        // Approach 2nd

        int n = s.length();
        int max = 0;
        char[] arr = s.toCharArray();
        char ans = s.charAt(0);
        Arrays.sort(arr);
        int i = 0, j = 0;
        while(j < n) {
            if(arr[i] == arr[j]) j++;
            else {
                int freq = j-i;
                if(freq > max) {
                    max = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        int freq = j-i;
        if(freq > max) {
            max = freq;
            ans = arr[i];
        }
        System.out.println(ans + " " + max);

    }
}

// Approach - 3 (Using HashMap)
class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i = 0; i < s.length(); i++){
            char e = s.charAt(i);
            map.put(e, map.getOrDefault(e, 0)+1);
        }
        char ans = 'z';
        int freq = 0;
        for(char ch : map.keySet()){
            int currFreq = map.get(ch);
            if(freq < currFreq){
                freq = currFreq;
                ans = ch;
            }
            else if(freq == currFreq && ch < ans) ans = ch;
        }
        return ans;
    }
}

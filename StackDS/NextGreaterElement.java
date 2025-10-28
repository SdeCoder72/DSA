package StackDS;

import java.util.*;
import java.util.Stack;

public class NextGreaterElement {

    //Brute force approach
    public static int[] nextGreaterEle(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for(int i = 0; i<n; i++) {
            int j = 0;
            while(arr1[i] != arr2[j]) j++;
            for(; j<m; j++) {
                if(arr1[i] < arr2[j]) {
                    ans[i] = arr2[j];
                    break;
                }
            }
        }
        return ans;
    }
    // optimal
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums2) {
            while(!st.isEmpty() && num > st.peek()) {
                map.put(st.pop(), num);
            }
            st.push(num);
        }
        while(!st.isEmpty()) {
            map.put(st.pop(), -1);
        }
        for(int i = 0; i<n; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {4, 1, 2};
        int[] arr2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterEle(arr1, arr2)));
        System.out.println(Arrays.toString(nextGreaterElement(arr1, arr2)));


    }
}

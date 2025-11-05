package StackDS;

import java.util.Arrays;
import java.util.Stack;

public class LargestRecInHistogram {
    public static int[] rightSmallerNearest(int[] arr, int n){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i = n-1; i>=0; i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }
    public static int[] leftSmallerNearest(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i = 0; i<n; i++) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }
    public static int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] right = rightSmallerNearest(arr, n);
        int[] left = leftSmallerNearest(arr, n);
        System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(left));
        int maxArea = 0;
        for(int i = 0; i<n; i++){
            int ht = arr[i];
            int wdt = right[i] - left[i] -1;
            int area = ht*wdt;
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 6, 5, 4, 5,3};
        System.out.println(largestRectangleArea(arr));
    }
}

package StackDS;

import java.util.*;
import java.util.Stack;

public class DailyTemperature {
    public static int[] bruteDailyTemperature(int[] temperature) {
        int n = temperature.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 0);
        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                if (temperature[j] > temperature[i]) {
                    ans[i] = j - i;
                    break;
                }
            }
        }
        return ans;
    }
    public static int[] dailyTemperatures(int[] temperature) {
        int n = temperature.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i = n-1; i>= 0; i--){
            while(!st.isEmpty() && temperature[i] >= temperature[st.peek()]) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i] = 0;
            }
            else {
                ans[i] = st.peek() - i;
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
        System.out.println(Arrays.toString(bruteDailyTemperature(temperatures)));
    }
}

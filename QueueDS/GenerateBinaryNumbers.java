package QueueDS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static ArrayList<String> generateBinary(int n) {
        ArrayList<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n > 0) {
            String temp = q.remove();
            ans.add(temp);
            q.add(temp+"0");  // Generate left child
            q.add(temp+"1");  // Generate right child
            n--;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(generateBinary(4));
        System.out.println(generateBinary(10));
        System.out.println(generateBinary(15));
    }
}



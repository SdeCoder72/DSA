package LinkedList;

import java.util.Arrays;

public class SpiralMatrix4 {
    public static void main(String[] args) {




    }
    public static int[][] spiralMatrix(int m, int n, Node head) {
        int[][] ans = new int[m][n];
        for(int[] row : ans) {
            Arrays.fill(row, -1);
        }
        int fc = 0, fr = 0, lc = n-1, lr = m;
        Node temp = head;
        while(temp != null) {
            for(int i = fc; i<= lc; i++) {
                if(temp == null) break;
                ans[fr][i] = temp.val;
                temp = temp.next;
            }
            if(temp == null) break;
            fr++;
            for(int j = fr; j<= lr; j++) {
                if(temp == null) break;
                ans[j][lc] = temp.val;
                temp = temp.next;
            }
            if(temp == null) break;
            lc--;
            for(int i = lc; i>= fc; i--) {
                if(temp == null) break;
                ans[lr][i] = temp.val;
                temp = temp.next;
            }
            if(temp == null) break;
            lr--;
            for(int j = lr; j>=fr; j--) {
                if(temp == null) break;
                ans[j][fc] = temp.val;
                temp = temp.next;
            }
            if(temp == null) break;
            fc++;
        }
        return ans;
    }
}

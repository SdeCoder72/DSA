package MultiDimentionalArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        List<List<Integer>>  ans = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            ans.add(new ArrayList<>());
            for(int j = 0; j<=i; j++) {
                if(j==0 || j==i) ans.get(i).add(1);
                else {
                    ans.get(i).add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
                }
            }

        }
        System.out.println(ans);
    }
}

package Strings;

public class SubStringOfString {
    public static void main(String[] args) {
        String str = "6759";
        int n = str.length();
        int sum = 0;
        for(int i = 0; i<=n; i++){
            for(int j = i+1; j <= n; j++){
                String s = str.substring(i,j);
                int num = Integer.parseInt(s);
                sum +=  num;
                System.out.print(str.substring(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println(sum);
    }
}

package Strings;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String t = "Alok";
        StringBuilder sb = new StringBuilder(t);
        sb.reverse();
        t = sb.toString();
        System.out.println(t);


        String s = "Raman";
        StringBuilder str = new StringBuilder(s);

        // reversing str builtIn method
        str.reverse();
        System.out.println(str);

        // reversing str
        int n = str.length();
        int i = 0, j = n-1;
        while (i <= j) {
            char ch = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, ch);
            i++;
            j--;
        }
        System.out.println(str);

        //time-consuming process
        str.deleteCharAt(1);
        System.out.println(str);
        str.insert(1, 'a');
        System.out.println(str);
        str.delete(3, 5);
        System.out.println(str);
    }
}

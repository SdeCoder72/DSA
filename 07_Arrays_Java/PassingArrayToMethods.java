package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        //pass by reference
        int[] x = {10, 54, 34, 22};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] x) {
        x[3]= 75;
    }
}

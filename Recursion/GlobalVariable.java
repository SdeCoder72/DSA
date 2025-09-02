package Recursion;

public class GlobalVariable {
    static int x = 20;
    public static void main(String[] args) {
        fun();
        System.out.println(x);
        x = 5;
        System.out.println(x);
        int x = 50;
        System.out.println(x);
        x = 100;
        System.out.println(x);

    }
    public static void fun() {
        System.out.println("Value of x in 2nd function : " + x);
    }
}

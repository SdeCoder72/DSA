package Strings;

public class PassingStringToMethod {
    public static void change(String s) {
        s = "Shanaya";
    }

    public static void main(String[] args) {
        String str = "Sabina";
        System.out.println(str);
        change(str);   // pass by value
        System.out.println(str);
    }
}

package Basic_Java_Program;

public class IncrementDecrement_Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println(a + " " + b);  // o/p - 6 5 . initially a = 5, then b get the value of a which is 5, so b=5. then, 'a' incremented by 1 so a became 6.

        int s = 10;
        int t = ++s;
        System.out.println(s + " " + t);

        // ++x = pre-increment
        // --x = pre-decrement
        // x++ = post-increment
        // x-- = post-decrement

        int x = 15;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        System.out.println(x++);
        System.out.println(x--);
        System.out.println(++x);
        System.out.println(--x);
    }
}

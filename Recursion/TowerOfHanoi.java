package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, 'a', 'c', 'b');
    }
    public static void hanoi(int n, char a, char c, char b) {
        if(n == 0) return;
        hanoi(n-1, a, b, c);
        System.out.println(a + " - "+ c);
        hanoi(n-1, b, c, a);

    }
}

package Loops;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //continue
        for(int i = 1; i <= 100; i++) {
            if(i%2 == 1) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        //break

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        boolean flag = true;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                flag = false;
                break;
            }
        }
        if(n==1) System.out.println(n + " is Neither composite nor prime");
        else if(flag) System.out.println(n + " is Prime Number");
        else System.out.println(n + " is a Composite Number");
    }
}

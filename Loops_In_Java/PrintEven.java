package Loops;

public class PrintEven {
    public static void main(String[] args) {


        for(int i = 2; i<=100; i+=2) {
            System.out.print(i + " ");
        }

        System.out.println();
        // print odd

        for(int i = 1; i <= 100; i+=2) {
            System.out.print(i + " ");
        }

    }
}

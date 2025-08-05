package Loops;

public class WhileLoop {
    public static void main(String[] args) {
        // for loop
        for(int i = 1; i<=10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //while loop
        int i = 1;
        while(i<=10) {
            System.out.print(i+ " ");
            i++;
        }

        System.out.println();
        //do while
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        }while (j <= 10);



    }

}

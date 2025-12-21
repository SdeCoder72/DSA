import java.util.Scanner;

public class PrintStarsAsPerTheValuePresentInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the " + n + " elements: ");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        // finding max value in the array
        int max = 0;
        for(int i= 0; i<n; i++) {
            max = Math.max(max, arr[i]);
        }

        for(int i = 0; i<max; i++){
            for(int j = 0; j<n; j++) {
                if(arr[j] > i) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }

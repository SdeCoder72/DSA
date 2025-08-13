package Arrays;

public class MultiplyOddAndEvenIndexValue {
    public static void main(String[] args) {
     int[] arr = {10, 20, 30, 40, 50, 60};
     print(arr);
     for(int i = 0; i<arr.length; i++) {
         if(i%2 == 1) arr[i] *= 2;
         else arr[i] += 10;
     }
     print(arr);
    }
    public static void print(int[] arr) {
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

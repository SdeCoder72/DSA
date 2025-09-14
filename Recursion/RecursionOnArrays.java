package Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr= {3,6,4,3,7,8,1,45,8};

        tailRecPrint(arr, 0);
        System.out.println();
        TailRecPrintArrReverse(arr, arr.length-1);
        System.out.println();
        nonTailRecPrint(arr, 0);

    }
    public static void tailRecPrint(int[] arr, int i) {
        if(i == arr.length) return;
        System.out.print(arr[i] + " ");
        tailRecPrint(arr, i+1);
    }
    public static void TailRecPrintArrReverse(int[] arr, int i) {
        if(i < 0) return;
        System.out.print(arr[i] + " ");
        TailRecPrintArrReverse(arr, i -1);
    }
    public static void nonTailRecPrint(int[] arr, int i) {
        if(i == arr.length) return;
        nonTailRecPrint(arr, i+1);
        System.out.print(arr[i] + " ");
    }
}

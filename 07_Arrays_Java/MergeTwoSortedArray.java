package Arrays;

import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st array: ");
        int aLen = sc.nextInt();
        int[] a = new int[aLen];
        System.out.print("Enter the elements of the 1st array: ");
        for(int i = 0; i<aLen; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the size of 2nd array: ");
        int bLen = sc.nextInt();
        int[] b = new int[bLen];
        System.out.print("Enter the elements of the 2nd array: ");
        for(int i = 0; i<bLen; i++) {
            b[i] = sc.nextInt();
        }

        //code ..

        int[] c = new int[aLen+bLen];
        merge(c, a, b);


        for(int ele : c) System.out.print(ele + " ");
        System.out.println();
    }
    public static void merge(int[]c, int[] a, int[] b) {
        int i=0, j=0, k=0;
//        while(i<a.length && j<b.length) {
//            if(a[i] < b[j]){
//                c[k++] = a[i++];
//            }
//            else {
//                c[k++] = b[j++];
//            }
//        }  // same as below's one line code
        while(i<a.length && j<b.length) c[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
        while(i<a.length) c[k++] = a[i++];
        while (j<b.length) c[k++] = b[j++];
    }

}

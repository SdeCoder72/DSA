package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIn_JavaBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //adding values
        arr.add(4);
        arr.add(7);
        arr.add(2);
        arr.add(9);

        //printing element
        System.out.println(arr.get(3));
        //modifying element
        arr.set(3, 44);
        System.out.println(arr.get(3));
        //printing the entire array
        System.out.println(arr);

        int n = arr.size();
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // 4 7 2 44
        arr.add(90); // 4 7 2 44 90
        arr.add(2, 100);
        System.out.println(arr);  // 4 7 100 2 44 90
        arr.removeLast();
        System.out.println(arr);  // 4 7 100 2 44

        //reversing
        int i=0, j=arr.size()-1;
        while(i<j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
//        Collections.reverse(arr);
        System.out.println(arr);   // 44 2 100 7 4

    }
}

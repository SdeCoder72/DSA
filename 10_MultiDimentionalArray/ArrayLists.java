package MultiDimentionalArray;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(7); a.add(6); a.add(2);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(6); b.add(11); b.add(10);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(4); c.add(8); c.add(13); c.add(99); c.add(5);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

        System.out.println(arr);

        for(int i = 0; i<arr.size(); i++) {
            for(int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println();

        arr.add(new ArrayList<>());

        arr.get(arr.size()-1).add(15);
        arr.get(arr.size()-1).add(16);
        arr.getFirst().add(20);
        arr.getLast().add(40);
        for(ArrayList<Integer> list : arr) {
            for(int ele : list) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        System.out.println(arr.size());
    }
}

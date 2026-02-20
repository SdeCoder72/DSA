import java.util.*;
import java.lang.*;
import java.io.*;
class Heap {
    private int[] arr;
    private int idx = 1;
    public Heap(int capacity){
        arr = new int[capacity +1];
    }
    int size() {
        return idx - 1;
    }
    int peek() {
        if(size() == 0) throw new NoSuchElementException();
        return arr[1];
    }
    void add(int ele) {
        if(idx == arr.length) throw new IndexOutOfBoundsException();
        int root = idx;
        arr[idx++] = ele;
        // rearrange
        while(root != 1) {
            int parent = root/2;
            if(arr[root] < arr[parent]){
                int temp = arr[root];
                arr[root] = arr[parent];
                arr[parent] = temp;
                root = parent;
            }
            else break;
        }
    }
    int remove() {
        if(idx == 1) throw new NoSuchElementException();
        int removedEle = arr[1];
        arr[1] = arr[idx-1];
        idx--;
        // rearrange
        int root = 1;
        while(root <= size()) {
            int left = 2 * root;
            int right = 2 * root +1;
            int leftValue = left <= size() ? arr[left] : Integer.MAX_VALUE;
            int rightValue = right <= size() ? arr[right] : Integer.MAX_VALUE;
            if(arr[root] < leftValue && arr[root] < rightValue) break;
            else {
                int temp = arr[root];
                if(leftValue < rightValue) {
                    arr[root] = arr[left];
                    arr[left] = temp;
                    root = left;
                } else {
                    arr[root] = arr[right];
                    arr[right] = temp;
                    root = right;
                }
            }
        }
        return removedEle;
    }
    void print() {
        for(int i = 1; i < idx; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
class Codechef
{
	public static void main (String[] args)
	{
		Heap h = new Heap(10);
        h.add(10); h.add(15); h.add(8); h.add(9); h.add(4);
        h.print();
        System.out.println(h.remove());
        h.print();
        h.add(2);
        h.print();
        System.out.println(h.remove());
        h.print();
	}
}

package TreeDS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeImplementationUsingQueue {
    static class Node{
        int data;
        Node right;
        Node left;
        //Constructor
        public Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data of Root Node: ");
        int x = sc.nextInt();
        Node root = new Node(x);
        Queue<Node> q =  new LinkedList<>();
        q.add(root);

        // Create Tree
        while(!q.isEmpty()) {
            Node temp = q.remove();
            System.out.print("Enter left child Node data of " + temp.data + ": " );
            int left = sc.nextInt();
            if(left != -1) {
                temp.left = new Node(left);
                q.add(temp.left);
            }
            System.out.print("Enter right child Node data of " + temp.data + ": ");
            int right = sc.nextInt();
            if(right != -1) {
                temp.right = new Node(right);
                q.add(temp.right);
            }
            System.out.println("Queue became: " + q);
        }

    }
}



/*

               1
           2        3
       4      5   6    7
       8          9
       10

 */
package TreeDS;

import java.util.Scanner;

public class TreeImplementationUsingRecursion {
    static class Node {
        int data;
        Node left;
        Node right;

        //Constructor
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    private static final Scanner sc = new Scanner(System.in);
    public static Node BinaryTree() {

        int x = sc.nextInt();
        // base case - no node
        if (x == -1) return null;
        Node temp = new Node(x);
        // creates left node
        System.out.print("Enter the left child of " + x + ": ");
        temp.left = BinaryTree();  // Recursive call for left
        //creates right node
        System.out.print("Enter the right child of " + x + ": ");
        temp.right = BinaryTree();  // Recursive call for right
        return temp;

    }

    public static void main(String[] args) {
        System.out.print("Enter the root Node: ");
        Node root = BinaryTree();
        System.out.println(root);
    }
}



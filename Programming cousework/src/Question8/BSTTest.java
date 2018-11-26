package Question8;

import java.util.Scanner;

public class BSTTest {
    public static void main(String [] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(2); 
        tree.insert(7); 
        tree.insert(9); 
        tree.insert(4); 
        tree.insert(1); 
        tree.insert(5); 
        tree.insert(3);
        tree.insert(6);
        tree.insert(0);
        tree.insert(8);
        
        System.out.println();
        tree.inorder();
        }
}


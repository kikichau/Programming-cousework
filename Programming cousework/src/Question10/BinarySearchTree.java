package Question10;

public class BinarySearchTree {
    /* Class containing left and right child of current node and data value*/
    class BinaryNode 
    { 
        int data; 
        BinaryNode left, right; 
  
        public BinaryNode(int d) 
        { 
            data = d; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
    BinaryNode root; 
  
    // Constructor 
    BinarySearchTree() 
    { 
        root = null; 
    } 
  
    // This method mainly calls deleteRec() 
    void deletedata(int data) 
    { 
        root = deleteRec(root, data); 
    } 
  
    /* A recursive function to insert a new data in BST */
    BinaryNode deleteRec(BinaryNode root, int data) 
    { 
        /* Base Case: If the tree is empty */
        if (root == null)  return root; 
  
        /* Otherwise, recur down the tree */
        if (data < root.data) 
            root.left = deleteRec(root.left, data); 
        else if (data > root.data) 
            root.right = deleteRec(root.right, data); 
  
        // if data is same as root's data, then This is the node 
        // to be deleted 
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.data = minValue(root.right); 
  
            // Delete the inorder successor 
            root.right = deleteRec(root.right, root.data); 
        } 
  
        return root; 
    } 
  
    int minValue(BinaryNode root) 
    { 
        int minv = root.data; 
        while (root.left != null) 
        { 
            minv = root.left.data; 
            root = root.left; 
        } 
        return minv; 
    } 
  
    // This method mainly calls insertRec() 
    void insert(int data) 
    { 
        root = insertRec(root, data); 
    } 
  
    /* A recursive function to insert a new data in BST */
    BinaryNode insertRec(BinaryNode root, int data) 
    { 
  
        /* If the tree is empty, return a new node */
        if (root == null) 
        { 
            root = new BinaryNode(data); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (data < root.data) 
            root.left = insertRec(root.left, data); 
        else if (data > root.data) 
            root.right = insertRec(root.right, data); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
  
    // This method mainly calls InorderRec() 
    void inorder() 
    { 
        inorderRec(root); 
    } 
  
    // A utility function to do inorder traversal of BST 
    void inorderRec(BinaryNode root) 
    { 
        if (root != null) 
        { 
            inorderRec(root.left); 
            System.out.print(root.data + " "); 
            inorderRec(root.right); 
        } 
    } 
}

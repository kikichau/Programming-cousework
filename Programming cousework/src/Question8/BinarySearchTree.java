package Question8;

/* Class containing left and right child of current node and key value*/
class BinarySearchTree {
    // Root of BST 
    BinaryNode root;
    
    // Constructor 
    BinarySearchTree(){
        root = null; 
    }
    
    class BinaryNode {
        int data;
        BinaryNode left;
        BinaryNode right;

        public BinaryNode(int d) {
            data = d; 
            left = right = null;
        }

        public int getData() {
            return data;
        }   
    }
    
    // This method mainly calls insertSubtree()
    void insert(int data) {
        root = insertSubtree(root, data);
    }
    
    /* A recursive function to insert a new key in BST */
    BinaryNode insertSubtree(BinaryNode root,int data) {
        if (root == null) { 
            root = new BinaryNode(data); 
            return root; 
        } 
        
        /* Otherwise, recur down the tree */
        if (data < root.data) 
            root.left = insertSubtree(root.left, data); 
        else if (data > root.data) 
            root.right = insertSubtree(root.right, data);
        
        /* return the (unchanged) node pointer */
        return root;
    }
    
    void inorder() {
        inorderSubtree(root); 
    }
        
    void inorderSubtree(BinaryNode root) { 
        if (root != null) { 
            inorderSubtree(root.left); 
            System.out.println(root.data); 
            inorderSubtree(root.right); 
        } 
    }
}


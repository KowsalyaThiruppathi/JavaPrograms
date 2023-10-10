import javax.swing.tree.TreeNode;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {

    public Node root = null;

    public void insert(int data) {
        root = traversal(root, data);
    }

    public Node traversal(Node curr, int data) {
        if (curr == null) {
            return new Node(data);
        } else {
            if (data < curr.data) {
                curr.left = traversal(curr.left, data);
            } else {
                curr.right = traversal(curr.right, data);
            }
            return curr;
        }
    }
     public void delete(int key) {
        root = deleteNode(root, key);
    }
     public Node deleteNode(Node curr, int key) {
             if(curr == null) 
            return curr;
        if(key > curr.data){
            curr.right = deleteNode(curr.right, key);
        }else if(key < curr.data){
            curr.left = deleteNode(curr.left, key);
        }else{ 
            if(curr.left == null && curr.right == null){ 
                curr = null;
            }
            if (curr.left == null) {
                return curr.right;
             }
             if (curr.right == null) {
                 return curr.left;
            }
            else { 
                curr.data = successor(curr); 
                curr.right = deleteNode(curr.right, curr.data);
            }
        }
        return curr;
    }
     private int successor(Node curr){
        curr = root.right;
        while(curr.left != null){
            curr = curr.left;
        }
        return curr.data;
    }



    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(10);
        tree.insert(7);
        tree.insert(9);

        tree.delete(7);

    }
}

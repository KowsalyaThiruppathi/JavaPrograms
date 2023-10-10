   class AVLTree {
    private Node root;

    class Node {
        int data;
        int height;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }

   
    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node curr, int data) {
        if (curr == null)
            return new Node(data);

        if (data < curr.data)
            curr.left = insert(curr.left, data);
        else if (data > curr.data)
            curr.right = insert(curr.right, data);

       
        curr.height = Math.max(height(curr.left), height(curr.right)) + 1;
        return balance(curr);
    }

    
    private Node rotateWithRightChild(Node curr) {
        Node temp = curr.right;
        curr.right = temp.left;
        temp.left = curr;

        curr.height = Math.max(height(curr.left), height(curr.right)) + 1;
        temp.height = Math.max(height(temp.left), height(temp.right)) + 1;

        return temp;
    }

    
    private Node rotateWithLeftChild(Node curr) {
        Node temp = curr.left;
        curr.left = temp.right;
        temp.right = curr;

        curr.height = Math.max(height(curr.left), height(curr.right)) + 1;
        temp.height = Math.max(height(temp.left), height(temp.right)) + 1;

        return temp;
    }

  
    private Node doubleWithRightChild(Node curr) {
        curr.right = rotateWithLeftChild(curr.right);
        return rotateWithRightChild(curr);
    }

    private Node doubleWithLeftChild(Node curr) {
        curr.left = rotateWithRightChild(curr.left);
        return rotateWithLeftChild(curr);
    }
private int height(Node node) {
    if (node == null) {
        return 0;
    }

    int leftHeight = height(node.left);
    int rightHeight = height(node.right);

    return Math.max(leftHeight, rightHeight) + 1;
}
    
    

   private Node balance(Node node) {
    int balanceFactor = height(node.left) - height(node.right);

    switch (balanceFactor) {
        case 2:
            if (height(node.left.left) >= height(node.left.right)) {
                return rotateWithLeftChild(node);
            } else {
                return doubleWithLeftChild(node);
            }
        case -2:
            if (height(node.right.right) >= height(node.right.left)) {
                return rotateWithRightChild(node);
            } else {
                return doubleWithRightChild(node);
            }
        default:
            return node;
    }
}

 public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);

        
    }
}
   }

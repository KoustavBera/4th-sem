package CSW_2.Assignments.Assignment_6;

class Node {

    int info;
    Node left;
    Node right;

    public Node(int info) {
        this.info = info;
        left = right = null;
    }
} 

public class q3_isBST {

    Node root;

    public q3_isBST() {
        root = null;
    }

    public boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTUtil(Node node, int minValue, int maxValue) {
        if (node == null) {
            return true;
        }
        if (node.info <= minValue || node.info >= maxValue) {
            return false;
        }

        return isBSTUtil(node.left, minValue, node.info) && isBSTUtil(node.right, node.info, maxValue);
    }

    public static void main(String[] args) {
        q3_isBST tree = new q3_isBST();

        // Construct a valid BST manually
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        System.out.println("Is the tree bST ? " + tree.isBST()); // true
    }
}

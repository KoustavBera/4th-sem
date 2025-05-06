class BSTNode {
    int info;
    BSTNode left, right;

    public BSTNode(int value) {
        info = value;
        left = right = null;
    }
}

public class p1_BST1 {

    BSTNode root;

    public p1_BST1() {
        root = null;
    }

    // Insert Method
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Helper method to insert recursively
    private BSTNode insertRec(BSTNode node, int value) {
        if (node == null) {
            node = new BSTNode(value);
            return node;
        }
        if (value < node.info) {
            node.left = insertRec(node.left, value);
        } else if (value > node.info) {
            node.right = insertRec(node.right, value);
        }
        return node;
    }

    // In-order Traversal (Left, Root, Right)
    public void inorder() {
        System.out.print("In-order: ");
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(BSTNode node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.info + " ");
            inorderRec(node.right);
        }
    }

    // Pre-order Traversal (Root, Left, Right)
    public void preorder() {
        System.out.print("Pre-order: ");
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(BSTNode node) {
        if (node != null) {
            System.out.print(node.info + " ");
            preorderRec(node.left);
            preorderRec(node.right);
        }
    }

    // Post-order Traversal (Left, Right, Root)
    public void postorder() {
        System.out.print("Post-order: ");
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(BSTNode node) {
        if (node != null) {
            postorderRec(node.left);
            postorderRec(node.right);
            System.out.print(node.info + " ");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        p1_BST1 bst = new p1_BST1();

        // Insert multiple nodes
        int[] values = { 50, 30, 70, 20, 40, 60, 80 };
        for (int val : values) {
            bst.insert(val);
        }

        // Display traversals
        bst.inorder(); // Expected: 20 30 40 50 60 70 80
        bst.preorder(); // Expected: 50 30 20 40 70 60 80
        bst.postorder(); // Expected: 20 40 30 60 80 70 50
    }
}
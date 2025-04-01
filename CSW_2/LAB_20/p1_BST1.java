
public class p1_BST1 {

    private void inorderRec(Node root) {
        if (root != null) {
            preorderRec(root.left);
            System.out.println(root.value + " ");

            preorderRec(root.right);
        }
    }

    static class Node {

        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }
    //Root of the BST
    static Node root;

    //Constructor for creating an empty BST
    public p1_BST1() {
        root = null;
    }

    //Insert method to insert a value into the BST
    public void insert(int value) {
        root = insertRec(root, value);
    }

    //Recursive function to insert a new value
    private Node insertRec(Node root, int value) {
        //If the tree is empty, create a new node
        if (root == null) {
            root = new Node(value);
            return root;
        }
        //Otherwise, recurse down the tree
        if (value < root.value) {
            root.left = insertRec(root.right, value);

        } else if (value > root.value) {
            root.right = insertRec(root.right, value);

        }
        //Return the (unchanged) node pointer
        return root;
    }

    //Search  method to find a value in BST
    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node root, int value) {
        //Base cases : root is null or value is present in the root
        if (root == null) {
            return false;
        }
        if (root.value == value) {
            return true;
        }
        if (value > root.value) {
            return searchRec(root.right, value);
        }

        return searchRec(root.left, value);
    }

    //In order traversal of the tree
    public void inorderTraversal(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.value + " ");
            inorderRec(root.right);
        }
    }

    //Pre-order traversal of the tree
    public void preorderTraversal() {
        preorderRec(root);
    }

    private void preorderRec(Node root) {
        if (root != null) {
            System.out.println(root.value + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root);
        }
    }

    public static void main(String[] args) {
        p1_BST1 bst = new p1_BST1();
        bst.insert(50);
        bst.insert(50);
        bst.insert(40);
        bst.insert(50);
        bst.insert(50);
        bst.insert(50);
        bst.insert(50);

        System.out.println("Inorder traversal of BST");
        bst.inorderTraversal(root);
        System.out.println();

        System.out.println("pre order traversal of bst");
        bst.preorderRec(root);

        System.out.println("Search 40" + bst.search(40));
        System.out.println("seach 25" + bst.search(25));

        postorder(root);
    }

}

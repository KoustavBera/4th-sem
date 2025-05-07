package CSW_2.Assignments.Assignment_6;

class Node {

    int info;
    Node left;
    Node right;

    public Node(int info) {
        this.info = info;
        this.left = this.right = null;
    }
}

public class q2_CreateTree {

    Node root;

    public void CreateTree(int[] arr) {
        for (int i : arr) {
            insert(i);
        }
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.info) {
            node.left = insertRec(node.left, value);
        } else if (value > node.info) {
            node.right = insertRec(node.right, value);
        }
        return node;
    }

    private void preorder() {
        System.out.println("Preorder :");
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.info + " ");
        preorderRec(node.left);
        preorderRec(node.right);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60,
            70, 80, 90, 100};
        q2_CreateTree ob = new q2_CreateTree();
        ob.CreateTree(arr);
        ob.preorder();
    }
}


class q1_BSTNode {
	int info;
	q1_BSTNode left, right;

	// Constructor to initialise node
	public q1_BSTNode(int info) {
		this.info = info;
		this.left = this.right = null;
	}
}

public class q1_BinarySearchTree {
	q1_BSTNode root;

	// Constructor to initialize empty tree
	public q1_BinarySearchTree() {
		root = null;
	}

	// Public method to insert a value
	public void insert(int value) {
		root = insertRec(root, value);
	}

	// Recursive method to insert a value in BST
	private q1_BSTNode insertRec(q1_BSTNode node, int value) {
		if (node == null) {
			return new q1_BSTNode(value);
		}

		if (value < node.info) {
			node.left = insertRec(node.left, value);
		} else if (value > node.info) {
			node.right = insertRec(node.right, value);
		}

		// Duplicate values are ignored
		return node;
	}

	// in order
	public void inorder() {
		inorderRec(root);
		System.out.println();
	}

	private void inorderRec(q1_BSTNode node) {
		if (node != null) {
			inorderRec(node.left);
			System.out.print(node.info + " ");
			inorderRec(node.right);
		}
	}

	// pre order
	public void preorder() {
		preorderRec(root);
		System.out.println();
	}

	private void preorderRec(q1_BSTNode node) {
		if (node != null) {
			System.out.print(node.info + " ");

			preorderRec(node.left);
			preorderRec(node.right);
		}
	}

	// post order
	public void postorder() {
		postorderRec(root);
		System.out.println();
	}

	private void postorderRec(q1_BSTNode node) {
		if (node != null) {
			postorderRec(node.left);
			postorderRec(node.right);
			System.out.print(node.info + " ");
		}
	}

	public static void main(String[] args) {
		q1_BinarySearchTree bst = new q1_BinarySearchTree();

		// Insert multiple nodes
		int[] values = { 50, 30, 70, 20, 40, 60, 80 };
		for (int value : values) {
			bst.insert(value);
		}

		// Display the tree using different traversals
		System.out.print("In-order Traversal: ");
		bst.inorder();

		System.out.print("Pre-order Traversal: ");
		bst.preorder();

		System.out.print("Post-order Traversal: ");
		bst.postorder();
	}
}
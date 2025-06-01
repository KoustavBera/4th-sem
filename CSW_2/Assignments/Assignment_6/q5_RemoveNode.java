class BNode {
	int data;
	BNode left, right;

	public BNode(int data) {
		this.data = data;
		left = right = null;
	}
}

public class q5_RemoveNode {
	BNode root;

	// Public method to insert a value
	public void insert(int value) {
		root = insertRec(root, value);
	}

	// Recursive method to insert a value in BST
	private BNode insertRec(BNode node, int value) {
		if (node == null) {
			return new BNode(value);
		}

		if (value < node.data) {
			node.left = insertRec(node.left, value);
		} else if (value > node.data) {
			node.right = insertRec(node.right, value);
		}

		// Duplicate values are ignored
		return node;
	}

	// pre order
	public void preorder() {
		preorderRec(root);
		System.out.println();
	}

	private void preorderRec(BNode node) {
		if (node != null) {
			System.out.print(node.data + " ");

			preorderRec(node.left);
			preorderRec(node.right);
		}
	}

	// Remove
	public void delete(int key) {
		root = deleteRec(root, key);
	}

	private BNode deleteRec(BNode root, int key) {
		if (root == null)
			return null;

		if (key < root.data) {
			root.left = deleteRec(root.left, key);
		} else if (key > root.data) {
			root.right = deleteRec(root.right, key);
		} else {
			// we have arrived at the node which has to be deleted

			// Case 1: Node has no children so just delete it
			if (root.left == null && root.right == null) {
				return null;
			}
			// Case 2: Node has one child, replace deleted node by its child
			if (root.left == null)
				return root.right; // replace root = deleteRec() current root is replace by root.right
			if (root.right == null)
				return root.left;

			// Case 3: Node has both child
			BNode successor = finMin(root.right);
			root.data = successor.data;
			root.right = deleteRec(root.right, successor.data);
		}
		return root;
	}

	private BNode finMin(BNode node) {
		if (node == null)
			return null;
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}

	public static void main(String[] args) {
		q5_RemoveNode tree = new q5_RemoveNode();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		System.out.println("preorder before deletion:");
		tree.preorder(); // 20 30 40 50 60 70 80

		tree.delete(20); // Case 1: Leaf node
		tree.delete(30); // Case 2: Node with one child
		tree.delete(50); // Case 3: Node with two children

		System.out.println("preorder after deletion:");
		tree.preorder(); // 40 60 70 80
	}
}

import org.w3c.dom.Node;

class BSTNode {
	int info;
	BSTNode left, right;

	public BSTNode(int info) {
		this.info = info;
		left = right = null;
	}
}

public class q3_isBST {
	BSTNode root;

	public q3_isBST() {
		root = null;
	}

	public boolean isBST(BSTNode root) {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean isBSTUtil(BSTNode root, int min, int max) {
		if (root == null || (root.left == null && root.right == null))
			return true;

		// Check current BSTNode value
		if (root.info <= min || root.info >= max) {
			return false;
		}

		// check left and right subtrees with updated settings
		return isBSTUtil(root.left, min, root.info) && isBSTUtil(root.right, root.info, max);
	}

	// Example usage
	public static void main(String[] args) {
		q3_isBST tree = new q3_isBST();
		BSTNode root = new BSTNode(10);
		root.left = new BSTNode(5);
		root.right = new BSTNode(20);
		root.left.left = new BSTNode(2);
		root.left.right = new BSTNode(8);

		System.out.println(tree.isBST(root)); // Output: true
	}
}

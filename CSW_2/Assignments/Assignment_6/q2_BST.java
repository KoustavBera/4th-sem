class BSTNode {
	int info;
	BSTNode left, right;

	public BSTNode(int info) {
		this.info = info;
		this.left = this.right = null;
	}
}

public class q2_BST {
	BSTNode root;

	public q2_BST() {
		root = null;
	}

	// Corrected method to build tree from sorted array
	public void createTree(int[] arr) {
		root = createTreeRec(arr, 0, arr.length - 1);
	}

	private BSTNode createTreeRec(int[] arr, int start, int end) {
		if (start > end)
			return null;

		int mid = (start + end) / 2;
		BSTNode node = new BSTNode(arr[mid]);

		node.left = createTreeRec(arr, start, mid - 1);
		node.right = createTreeRec(arr, mid + 1, end);

		return node;
	}

	// In-order traversal
	public void inorder() {
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

	public static void main(String[] args) {
		q2_BST bst = new q2_BST();
		int[] sortedArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		bst.createTree(sortedArray);

		System.out.print("In-order Traversal: ");
		bst.inorder();
	}
}

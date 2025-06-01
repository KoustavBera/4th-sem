class Country {
	String name;
	int population;

	public Country(String name, int population) {
		this.name = name;
		this.population = population;

	}
}

class BNode {
	Country obj_Country;
	BNode left, right;

	public BNode(Country obj_Country) {
		this.obj_Country = obj_Country;
		this.left = this.right = null;
	}
}

public class q4_BSTCountry {
	BNode root;

	public q4_BSTCountry() {
		this.root = null;
	}

	// method to insert trees into BST
	public void insert(Country c) {
		root = insertRec(root, c);
	}

	private BNode insertRec(BNode root, Country c) {
		if (root == null) {
			return new BNode(c);
		}

		if (c.population <= root.obj_Country.population) {
			root.left = insertRec(root.left, c);
		} else {
			root.right = insertRec(root.right, c);
		}

		return root;
	}

	public void preorder() {
		if (root == null)
			return;
		preorderRec(root);
		System.out.println();
	}

	private void preorderRec(BNode root) {
		if (root == null)
			return;
		System.out.print(root.obj_Country.name + " ");
		preorderRec(root.left);
		preorderRec(root.right);
	}

	public static void main(String[] args) {
		Country c1 = new Country("IND", 1444000);
		Country c2 = new Country("CN", 1440000);
		Country c3 = new Country("US", 334000);
		Country c4 = new Country("UK", 114000);
		Country c5 = new Country("PAK", 334000);
		q4_BSTCountry ob = new q4_BSTCountry();
		ob.insert(c1);
		ob.insert(c2);
		ob.insert(c3);
		ob.insert(c4);
		ob.insert(c5);
		ob.preorder();
	}
}

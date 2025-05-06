package CSW_2.Assignments.Assignment_6;

/* Create a class Country with members for name and population, along with a 
constructor and necessary methods.  */
class Country {
	String name;
	int population;

	public Country(
			String name,
			int population) {
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return this.name;
	}

	public int getPop() {
		return this.population;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
}

/*
 * s. Define a class BNode to store a Country object and
 * maintain references to its left and right children.
 */
class BNode {
	Country c;
	BNode left, right;

	public BNode(Country c) {
		this.c = c;
		left = right = null;
	}
}

/*
 * - . Implement a class BSTCountry with
 * a root node, a constructor, and a method to insert countries into the tree
 * based on their
 * population.
 */
public class q4_BSTCountry {
	q4_BSTCountry root;

	public q4_BSTCountry() {
		root = null;
	}

}

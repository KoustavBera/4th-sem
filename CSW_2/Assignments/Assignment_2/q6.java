package CSW_2.Assignments.Assignment_2;

import java.util.Objects;

public class q6 {
	static class Animal {
		String name, color, type;

		public Animal(String name, String color, String type) {
			this.color = color;
			this.name = name;
			this.type = type;
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, color, type);
		}

		public String toString() {
			return "Animal [Name: " + name + ", Color: " + color + ", Type: " + type + "]";
		}
	}

	// Driver class
	public static void main(String[] args) {
		// Creating multiple Animal objects
		Animal a1 = new Animal("Dog", "Brown", "Pet");
		Animal a2 = new Animal("Tiger", "Orange", "Wild");
		Animal a3 = new Animal("Parrot", "Green", "Pet");
		Animal a4 = new Animal("Elephant", "Grey", "Wild");

		// Printing hash codes
		System.out.println(a1 + " -> HashCode: " + a1.hashCode());
		System.out.println(a2 + " -> HashCode: " + a2.hashCode());
		System.out.println(a3 + " -> HashCode: " + a3.hashCode());
		System.out.println(a4 + " -> HashCode: " + a4.hashCode());
	}
}

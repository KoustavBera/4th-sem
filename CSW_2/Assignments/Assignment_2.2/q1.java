// package CSW_2.Assignments.Assignment_2.2;

public class q1 {
	static class Pair<K, V> {
		K key;
		V value;

		public Pair(K k, V v) {
			key = k;
			value = v;
		}

		// Getters
		public K getKey() {
			return this.key;
		}

		public V getValue() {
			return this.value;
		}

		// Setters
		public void setKey(K k) {
			this.key = k;
		}

		public void setValue(V v) {
			this.value = v;
		}
	}

	public static void main(String[] args) {
		Pair<String, String> p0 = new Pair<>("Name", "Koustav");
		Pair<String, Integer> p1 = new Pair<>("Roll", 2);
		Pair<String, Double> p2 = new Pair<>("cgpa", 9.5);
		System.out.println("Student Details :");
		System.out.println(p0.getKey() + ":" + p0.getValue());
		System.out.println(p1.getKey() + ":" + p1.getValue());
		System.out.println(p2.getKey() + ":" + p2.getValue());
	}
}

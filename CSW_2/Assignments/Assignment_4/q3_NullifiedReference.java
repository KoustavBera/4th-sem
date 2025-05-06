public class q3_NullifiedReference {
	String name;

	public q3_NullifiedReference(String name) {
		this.name = name;
		System.out.println(name + " object is created");
	}

	public void finalize() throws Throwable {
		System.out.println(name + "is garbage collected");
	}

	public static void main(String[] args) {
		q3_NullifiedReference ob = new q3_NullifiedReference("L1");
		ob = null;
		System.gc();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Error");
		}
	}
}

public class q4_AnonymousObject {
	String name;

	public q4_AnonymousObject(String name) {
		this.name = name;
		System.out.println(name + " object is created");
	}

	public void finalize() throws Throwable {
		System.out.println(name + " is garbage collected");
	}

	public static void main(String[] args) {
		new q4_AnonymousObject("L1");
		System.gc();

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error");
		}
	}
}

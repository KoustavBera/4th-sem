public class q2_ReassigningReference {
	String name;

	public q2_ReassigningReference(String name) {
		this.name = name;
		System.out.println(name + " object is created");
	}

	public void finalize() throws Throwable {
		System.out.println(name + " is garbage collected");
	}

	public static void main(String[] args) {
		q2_ReassigningReference ob1 = new q2_ReassigningReference("L1");
		q2_ReassigningReference ob2 = new q2_ReassigningReference("L2");
		ob1 = ob2;
		System.gc();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Error in execution");
		}
	}
}

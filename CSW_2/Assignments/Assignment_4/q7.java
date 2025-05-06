public class q7 {
	String name;
	int courseId;

	public q7(String name, int courseId) {
		this.name = name;
		this.courseId = courseId;
	}

	public static void memStats(String msg) {
		System.out.println(msg + " :");
		Runtime runtime = Runtime.getRuntime();
		// Convert all values to GB first
		double totalGB = runtime.totalMemory() / (1024.0 * 1024 * 1024);
		double freeGB = runtime.freeMemory() / (1024.0 * 1024 * 1024);
		double usedGB = totalGB - freeGB;

		System.out.printf("Total Memory : %.4f GB%n", totalGB);
		System.out.printf("Free Memory  : %.4f GB%n", freeGB);
		System.out.printf("Used Memory  : %.4f GB%n", usedGB);
		System.out.println("-----------------------------------------------------------");
	}

	public static void main(String[] args) {
		memStats("Initial :");
		q7 ob1 = new q7("Koustav", 124);
		q7 ob2 = new q7("hergi", 143);
		memStats("After object creation :");
		ob1 = null;
		ob2 = null;
		memStats("After nullification :");
		System.gc();
		memStats("After garbage collection");
	}

	public void finalize() throws Throwable {
		System.out.println("Garbage collected called for student :" + name);
	}
}

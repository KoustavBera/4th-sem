public class q5_MemoryUsage {
	private int intVal;
	private double dblVal;

	public q5_MemoryUsage(int i, double d) {
		intVal = i;
		dblVal = d;
	}

	// setting
	public void setIntVal(int i) {
		intVal = i;
	}

	public void setDblVal(double d) {
		dblVal = d;
	}

	// updating
	public void incIntVal() {
		intVal += 1;
	}

	public void incDblVal() {
		dblVal += 1;
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
		memStats("Before Object creation :");

		q5_MemoryUsage ob1 = new q5_MemoryUsage(1, 2.2);
		q5_MemoryUsage ob2 = new q5_MemoryUsage(3, 4.4);
		memStats("After objcet creation :");

		// updating
		ob1.setIntVal(10);
		ob1.incIntVal();
		ob1.setDblVal(10.1);
		ob1.incDblVal();

		ob2.setIntVal(5);
		ob2.incIntVal();
		ob2.setDblVal(5.5);
		ob2.incDblVal();
		memStats("After updating objects :");

		ob1 = null;
		ob2 = null;
		memStats("Aftermaking objects eligible for garbage collection :");

		System.gc();
		memStats("After garbage collection");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}
}

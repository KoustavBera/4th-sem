import java.util.ArrayList;
import java.util.List;

public class q6_MemoryIntensiveProgram {
	public static void main(String[] args) {
		memStats("Initial :");
		List<Object> objectList = new ArrayList<>();
		try {
			for (int i = 0; i < 1000; i++) {
				objectList.add(new byte[1024]);
				if (i % 500 == 0) {
					memStats("After creating " + i + " objects");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Out of memory! The program generated too many Objects");
		}
		memStats("After creating 1000 objects :");
		objectList.clear();
		memStats("Before garbage collection :");
		System.gc();
		memStats("After garbage collection :");
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

}

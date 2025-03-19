package CSW_2.Assignments.Assignment_3;

public class q4 {
	public static void main(String[] args) {
		int x = -12;
		try {
			if (x < 0) {
				throw new ArithmeticException("Square root of negative number is not allowed");
			}
			int sqRoot = (int) Math.sqrt(x);
			System.out.println(sqRoot + " status:OK");
		} catch (ArithmeticException e) {
			System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
		}
	}
}

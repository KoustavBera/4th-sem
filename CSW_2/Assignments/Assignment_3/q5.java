package CSW_2.Assignments.Assignment_3;

public class q5 {
	public static void main(String[] args) throws NumberFormatException, ArithmeticException {
		try {
			String s = "M3LON";
			int i = Integer.parseInt(s);
			try {
				int j = 1 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e.getClass().getSimpleName() + ":" + e.getMessage());
			}
		} catch (NumberFormatException e) {
			System.out.println(e.getClass().getSimpleName() + ":" + e.getMessage());
		}
	}
}

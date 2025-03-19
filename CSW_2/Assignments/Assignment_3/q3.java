package CSW_2.Assignments.Assignment_3;

public class q3 {
	public static void main(String[] args) throws NumberFormatException {
		String s1 = "123";
		String s2 = "1e3";
		try {
			int x1 = Integer.parseInt(s1);
			int x2 = Integer.parseInt(s2);
		} catch (NumberFormatException e) {
			System.out.println(e.getClass() + " message: " + e.getMessage());
		}
	}
}

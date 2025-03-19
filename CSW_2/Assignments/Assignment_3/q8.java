package CSW_2.Assignments.Assignment_3;

public class q8 {
	static class nationality {
		String name, con;

		public nationality(String n, String c) {
			name = n;
			con = c;
		}
	}

	static class isNotIndianException extends Exception {
		public isNotIndianException(String m) {
			super(m);
		}
	}

	public static void main(String[] args) throws isNotIndianException {
		nationality[] name = { new nationality("Arnould", "USA"), new nationality("Koustav", "India"),
				new nationality("Djikstra", "Sweden") };
		try {
			System.out.println("Indians");
			for (nationality n : name) {
				if (n.con != "Indian")
					throw new isNotIndianException(n.name + " is not Indian");
			}
		} catch (isNotIndianException e) {
			System.out.println(e.getClass().getSimpleName() + ":" + e.getMessage());
		}
	}
}

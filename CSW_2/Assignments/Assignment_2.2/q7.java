// package CSW_2.Assignments.Assignment_2

import java.util.Map;
import java.util.TreeMap;

public class q7 {
	static class Address {
		int plotNo;
		String at, post;

		public Address(int plotNo, String at, String post) {
			this.plotNo = plotNo;
			this.at = at;
			this.post = post;
		}

		@Override
		public String toString() {
			return "Plot No.:" + plotNo + "\nAt:" + at + "\nPost:" + post + "\n-------------";
		}
	}

	public static void main(String[] args) {
		TreeMap<String, Address> pMap = new TreeMap<>();
		pMap.put("Koustav", new Address(1, "Medinipur", "West Bengal"));
		pMap.put("JJ Thom", new Address(2, "Merryllion Rd", "DC Washington"));
		for (Map.Entry<String, Address> t : pMap.entrySet()) {
			System.out.println("Person:" + t.getKey() + "\nAddress:" + t.getValue());
		}

	}
}

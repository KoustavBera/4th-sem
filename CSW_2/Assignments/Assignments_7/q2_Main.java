interface Calculator {
	int process(int x, int y);
}

public class q2_Main {
	public static void main(String[] args) {
		int x = 1, y = 2;
		Calculator add = (a, b) -> a + b;
		Calculator sub = (a, b) -> a - b;
		Calculator mul = (a, b) -> a * b;
		Calculator div = (a, b) -> a / b;

		System.out.println("add " + add.process(x, y));
		System.out.println("sub " + sub.process(x, y));
		System.out.println("mul " + mul.process(x, y));
		System.out.println("div " + div.process(x, y));
	}
}

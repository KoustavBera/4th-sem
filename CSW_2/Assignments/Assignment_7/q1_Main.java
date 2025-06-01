interface StringProcessor {
	int process(String str);
}

public class q1_Main {

	public static void main(String[] args) {
		StringProcessor getLength = (String s) -> s.length();

		String s = "Hello Java";
		int n = getLength.process(s);

		System.out.println("Length :" + n);
	}
}
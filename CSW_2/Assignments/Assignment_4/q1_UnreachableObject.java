public class q1_UnreachableObject {

	String name;

	public q1_UnreachableObject(String name) {
		this.name = name;
		System.out.println(name + " object is created");
	}

	public static void show() {
		q1_UnreachableObject ob = new q1_UnreachableObject("L1");
		ob.display();
	}

	public void display() {
		q1_UnreachableObject ob = new q1_UnreachableObject("L2");
	}

	@Override
	public void finalize() throws Throwable {
		System.out.println(name + " is garbage collected.");
	}

	public static void main(String[] args) {
		show();
		System.gc();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Main method exit");
		}
	}
}
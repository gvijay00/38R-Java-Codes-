package methods;

public class StaticMethods {

	private static void addition() {
		System.out.println("addition starts");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		System.out.println("addition ends");
	}

	public static void main(String[] args) {
		System.out.println("main starts");

		// directly accessing static methods
		addition();

		// by using className
		StaticMethods.addition();
		
		System.out.println("main ends");
	}

}

package methods;

public class NonStaticMethod {

	int firstNumber;
	int secondNumber;

	private void performAddition() {
		System.out.println("Addition operation starts");
		int sum = firstNumber + secondNumber;
		System.out.println("Sum: " + sum);
		System.out.println("Addition operation ends");
	}

	public static void main(String[] args) {
		System.out.println("Main method starts");

		// Creating an object to access the non-static method and variables

		NonStaticMethod obj = new NonStaticMethod();
		obj.firstNumber = 10;
		obj.secondNumber = 20;

		obj.performAddition();

		System.out.println("Main method ends");
	}
}

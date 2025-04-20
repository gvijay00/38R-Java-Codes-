package methods;

public class Employee {
	int employeeId;
	String name;
	double monthlySalary;

	public void calculateAnnualSalary() {
		double annualSalary = monthlySalary * 12;
		System.out.println("Annual Salary: " + annualSalary);
	}

	public void displayEmployeeDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Monthly Salary: " + monthlySalary);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.employeeId = 1001;
		emp1.name = "Suresh";
		emp1.monthlySalary = 20000.0;

		emp1.displayEmployeeDetails();
		emp1.calculateAnnualSalary();
	}
}

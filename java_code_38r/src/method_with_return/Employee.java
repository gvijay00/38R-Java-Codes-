package method_with_return;

public class Employee {
    int id;
    String name;
    double salary;

    public void initializeValues(int empId, String empName, double empSalary) {
        id = empId;
        name = empName;
        salary = empSalary;
    }

    public double annualSalary() {
        return salary * 12;
    }

    public String display() {
        return "Employee ID: " + id + "\n" +
               "Employee Name: " + name + "\n" +
               "Monthly Salary: " + salary + "\n" +
               "Annual Salary: " + annualSalary();
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.initializeValues(101, "Ravi", 50000);
        System.out.println(emp.display());
    }
}

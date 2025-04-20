package seperate_initilization;

public class Employee {
    // Variables to store employee details
    String name;
    int empId;
    double salary;

    // Method to initialize employee details
    public void initializeValues(String n, int id, double s) {
        name = n;
        empId = id;
        salary = s;
    }

    // Method to calculate and return annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }

    public static void main(String[] args) {
        // Creating an instance of Employee
        Employee emp1 = new Employee();
        
        // Initializing and displaying employee details
        emp1.initializeValues("Raju", 1001, 10000);
        emp1.displayDetails();
        
        System.out.println("-----------------------------------------");
        
        Employee emp2 = new Employee();
        emp2.initializeValues("Rani", 1002, 20000);
        emp2.displayDetails();
        
        System.out.println("-----------------------------------------");
        
        Employee emp3 = new Employee();
        emp3.initializeValues("Ravi", 1003, 30000);
        emp3.displayDetails();
        
        System.out.println("-----------------------------------------");
        
        Employee emp4 = new Employee();
        emp4.initializeValues("Ramaya", 1004, 40000);
        emp4.displayDetails();
    }
}

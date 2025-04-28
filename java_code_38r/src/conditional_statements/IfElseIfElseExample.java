package conditional_statements;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int marks = 56; 

        // Check if marks are within the valid range
        if (marks >= 0 && marks <= 100) {

            // Check the performance based on marks
            if (marks <= 35) {
                System.out.println("Fail");
            } else if (marks <= 50) {
                System.out.println("Good");
            } else if (marks <= 75) {
                System.out.println("Best");
            } else {
                System.out.println("Excellent");
            }

        } else {
            System.out.println("Out of range");
        }
    }
}

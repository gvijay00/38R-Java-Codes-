package conditional_statements;

public class Grading {
    public static void main(String[] args) {
        char grade = 'C'; // Sample grade

        // Check if the grade is valid
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'F') {

            // Check the grade and print corresponding mark range
            if (grade == 'A') {
                System.out.println("Student may get 76 to 100");
            } else if (grade == 'B') {
                System.out.println("Student may get 51 to 75");
            } else if (grade == 'C') {
                System.out.println("Student may get 36 to 50");
            } else { // If grade is 'F'
                System.out.println("Student may get 0 to 35");
            }

        } else {
            System.out.println("Invalid grade");
        }
    }
}

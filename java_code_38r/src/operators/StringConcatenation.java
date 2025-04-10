package operators;

public class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "10k";
        String lastName = "coders";

        // Concatenation using +
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Concatenation with numbers
        int a = 10; 
        int b = 20;
        char ch='A';
        System.out.println("Sum: " + (a + b));  // Addition: 30
        System.out.println("Hai " + a + b); // Treated as Strings: "Hai 1020"
        System.out.println(ch+a+b+"java"+a+b);// 95java1020
        
    }
}

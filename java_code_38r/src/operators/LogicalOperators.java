package operators;

public class LogicalOperators {
    public static void main(String[] args) {
        
        // Logical AND (&&) - 4 combinations
        System.out.println("true && true  = " + (true && true));   // true
        System.out.println("true && false = " + (true && false));  // false
        System.out.println("false && true  = " + (false && true));  // false
        System.out.println("false && false = " + (false && false)); // false
        
        // Logical OR (||) - 4 combinations
        System.out.println("true || true  = " + (true || true));   // true
        System.out.println("true || false = " + (true || false));  // true
        System.out.println("false || true  = " + (false || true));  // true
        System.out.println("false || false = " + (false || false)); // false
        
        // Logical NOT (!) - 2 cases
        System.out.println("!true  = " + (!true));   // false
        System.out.println("!false = " + (!false));  // true
    }
}


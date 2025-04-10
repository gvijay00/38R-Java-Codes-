package operators;

public class UnaryOperators {
    public static void main(String[] args) {
    	
        // Integer examples
        int a = 5;
        System.out.println("Initial a: " + a);
        System.out.println("Pre-increment: " + (++a)); // a becomes 6, then printed
        System.out.println("Post-increment: " + (a++)); // a (6) printed, then becomes 7
        System.out.println("Pre-decrement: " + (--a)); // a becomes 6, then printed
        System.out.println("Post-decrement: " + (a--)); // a (6) printed, then becomes 5
        System.out.println("Final a: " + a);

        // Character examples
        char ch = 'A';
        System.out.println("Initial ch: " + ch);
        System.out.println("Pre-increment: " + (++ch)); // ch becomes 'B', then printed
        System.out.println("Post-increment: " + (ch++)); // ch ('B') printed, then becomes 'C'
        System.out.println("Pre-decrement: " + (--ch)); // ch becomes 'B', then printed
        System.out.println("Post-decrement: " + (ch--)); // ch ('B') printed, then becomes 'A'
        System.out.println("Final ch: " + ch);
    }
}


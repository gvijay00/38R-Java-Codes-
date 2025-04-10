package operators;

public class BitwiseOperators {
    public static void main(String[] args) {
    	
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        // Bitwise AND
        System.out.println("Bitwise AND (a & b): " + (a & b)); // 0001 -> 1

        // Bitwise OR
        System.out.println("Bitwise OR (a | b): " + (a | b)); // 0111 -> 7

        // Bitwise XOR
        System.out.println("Bitwise XOR (a ^ b): " + (a ^ b)); // 0110 -> 6

        // Bitwise Complement
        System.out.println("Bitwise Complement (~a): " + (~a)); // 1010 -> -6

        // Left Shift (Multiply by 2^1)
        System.out.println("Left Shift (a << 1): " + (a << 1)); // 1010 -> 10

        // Right Shift (Divide by 2^1)
        System.out.println("Right Shift (a >> 1): " + (a >> 1)); // 0010 -> 2

        // Unsigned Right Shift (for negative number)
        int c = -5; // 11111111111111111111111111111011 (in 32-bit binary)
        System.out.println("Unsigned Right Shift (c >>> 1): " + (c >>> 1));

    }
}

package input;
import java.util.Scanner;

public class AllDataTypes {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // 1. Taking byte input
        System.out.print("Enter a byte value: ");
        byte byteValue = sc.nextByte();
        System.out.println("You entered the byte value: " + byteValue);
        System.out.println("--------------------------");

        // 2. Taking short input
        System.out.print("Enter a short value: ");
        short shortValue = sc.nextShort();
        System.out.println("You entered the short value: " + shortValue);
        System.out.println("--------------------------");
        
        // 3. Taking int input
        System.out.print("Enter an integer value: ");
        int intValue = sc.nextInt();
        System.out.println("You entered the integer value: " + intValue);
        System.out.println("--------------------------");
        
        // 4. Taking long input
        System.out.print("Enter a long value: ");
        long longValue = sc.nextLong();
        System.out.println("You entered the long value: " + longValue);
        System.out.println("--------------------------");
        
        // 5. Taking float input
        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();
        System.out.println("You entered the float value: " + floatValue);
        System.out.println("--------------------------");
        
        // 6. Taking double input
        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();
        System.out.println("You entered the double value: " + doubleValue);
        System.out.println("--------------------------");
        
        // 7. Taking char input
        System.out.print("Enter a character: ");
        char charValue = sc.next().charAt(0); // Reading a single character
        System.out.println("You entered the character: " + charValue);
        System.out.println("--------------------------");
        
        // 8. Taking boolean input
        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanValue = sc.nextBoolean();
        System.out.println("You entered the boolean value: " + booleanValue);
        System.out.println("--------------------------");
        
        // Consume the leftover newline character after reading other data types
        sc.nextLine(); 

        // 9. Taking String input using nextLine() (to handle entire line including spaces)
        System.out.print("Enter a string: ");
        String stringValue = sc.nextLine();
        System.out.println("You entered the string: " + stringValue);


       

        // Close the scanner to avoid resource leak
        sc.close();
    }
}

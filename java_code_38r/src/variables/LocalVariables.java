package variables;

public class LocalVariables {
    public static void main(String[] args) {
    	
        // Initializing local variables with different values
        byte byteVar = 10;
        short shortVar = 300;
        int intVar = 100000;
        long longVar = 9999999999L;  // 'L' is required for long values
        float floatVar = 5.75f;      // 'f' is required for float values
        double doubleVar = 19.99;
        char charVar = 'Z';
        boolean booleanVar = true;

        // Printing local variable values
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + booleanVar);
    }
}

package variables;

public class StaticVariables {
	
    // Static variables
    static byte byteVar = 10;
    static short shortVar = 300;
    static int intVar = 100000;
    static long longVar = 9999999999L;  // 'L' is required for long values
    static float floatVar = 5.75f;      // 'f' is required for float values
    static double doubleVar = 19.99;
    static char charVar = 'Z';
    static boolean booleanVar = true;

    public static void main(String[] args) {
    	
        // Printing static variable values
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Char: " + charVar);
        System.out.println("Boolean: " + booleanVar);
    }
}


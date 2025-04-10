package variables;

public class AccessingStaticVariables {
	
    // Declaring static variables for all 8 primitive data types
    static byte byteVar = 127;
    static short shortVar = 32000;
    static int intVar = 100000;
    static long longVar = 10000000000L;
    static float floatVar = 10.5f;
    static double doubleVar = 99.99;
    static char charVar = 'A';
    static boolean booleanVar = true;

    public static void main(String[] args) {
    	
        // Accessing static variables using class name
        System.out.println("byte: " + AccessingStaticVariables.byteVar);
        System.out.println("short: " + AccessingStaticVariables.shortVar);
        System.out.println("int: " + AccessingStaticVariables.intVar);
        System.out.println("long: " + AccessingStaticVariables.longVar);
        System.out.println("float: " + AccessingStaticVariables.floatVar);
        System.out.println("double: " + AccessingStaticVariables.doubleVar);
        System.out.println("char: " + AccessingStaticVariables.charVar);
        System.out.println("boolean: " + AccessingStaticVariables.booleanVar);
        
        
        // Accessing static variables directly without class name (within the same class)
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


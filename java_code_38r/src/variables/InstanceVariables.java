package variables;

public class InstanceVariables {
	
    // Instance (non-static) variables
    byte byteVar = 10;
    short shortVar = 300;
    int intVar = 100000;
    long longVar = 9999999999L;
    float floatVar = 5.75f;
    double doubleVar = 19.99;
    char charVar = 'Z';
    boolean booleanVar = true;

    public static void main(String[] args) {
    	
        // Creating an object to access non-static variables
        InstanceVariables obj = new InstanceVariables();

        // Printing instance variable values using the object
        System.out.println("byte: " + obj.byteVar);
        System.out.println("short: " + obj.shortVar);
        System.out.println("int: " + obj.intVar);
        System.out.println("long: " + obj.longVar);
        System.out.println("float: " + obj.floatVar);
        System.out.println("double: " + obj.doubleVar);
        System.out.println("char: " + obj.charVar);
        System.out.println("boolean: " + obj.booleanVar);
    }
}


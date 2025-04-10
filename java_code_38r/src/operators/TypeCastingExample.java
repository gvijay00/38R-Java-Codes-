package operators;

public class TypeCastingExample {
    public static void main(String[] args) {
    	
        // Implicit Type Casting (Widening Conversion)
        int intVal = 100;
        long longVal = intVal;  // int to long (widening)
        float floatVal = longVal;  // long to float (widening)

        System.out.println("Implicit Type Casting:");
        System.out.println("int to long: " + longVal);
        System.out.println("long to float: " + floatVal);

        // Explicit Type Casting (Narrowing Conversion)
        double doubleVal = 99.99;
        int narrowedInt = (int) doubleVal;  // double to int (narrowing, fractional part lost)
        char charVal = (char) narrowedInt;  // int to char (narrowing)

        System.out.println("Explicit Type Casting:");
        System.out.println("double to int: " + narrowedInt);
        System.out.println("int to char: " + charVal);
    }
}

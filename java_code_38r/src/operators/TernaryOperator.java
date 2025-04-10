package operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20;

        // 1. Integer return type
        int max = (a > b) ? a : b;
        System.out.println("Max value: " + max);

        // 2. String return type
        String result = (a > b ) ? "a is greater" : "b is greater";
        System.out.println( result);

        // 3. Boolean return type
        boolean isAGreater = (a > b) ? true : false;
        System.out.println("Is 'a' greater than 'b'? " + isAGreater);
    }
}


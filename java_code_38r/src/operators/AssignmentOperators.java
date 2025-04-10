package operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        
        int a = 10;
        a += 5;  // a = a + 5;
        System.out.println("After += : " + a);  // 15
        
        int b = 10;
        b -= 3;  // b = b - 3;
        System.out.println("After -= : " + b);  // 7

        int c = 10;
        c *= 2;  // c = c * 2;
        System.out.println("After *= : " + c);  // 20

        int d = 10;
        d /= 4;  // d = d / 4;
        System.out.println("After /= : " + d);  // 2

        int e = 10;
        e %= 3;  // e = e % 3;
        System.out.println("After %= : " + e);  // 1
    }
}

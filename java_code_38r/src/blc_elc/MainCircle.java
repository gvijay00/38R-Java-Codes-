package blc_elc;

// ELC ---> EXECUTABLE LOGIC CLASS
public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.initializeValues(10);
        System.out.println(circle.display());

        System.out.println("-------------------------------");

        Circle circle2 = new Circle();
        circle2.initializeValues(33.33);
        System.out.println(circle2.display());
    }
}

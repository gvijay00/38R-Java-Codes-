package blc_elc;

// ELC ---> EXECUTABLE LOGIC CLASS
public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.initializeValues(10, 5);
        System.out.println(rect1.display());

        System.out.println("-------------------------------");

        Rectangle rect2 = new Rectangle();
        rect2.initializeValues(20, 15);
        System.out.println(rect2.display());
    }
}

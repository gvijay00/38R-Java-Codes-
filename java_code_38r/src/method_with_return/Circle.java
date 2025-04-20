package method_with_return;

public class Circle {
    static double PI = 3.14;
    double radius;

    public double areaOfCircle() {
        return PI * radius * radius;
    }

    public double circumferenceOfCircle() {
        return 2 * PI * radius;
    }

    public void initializeValues(double r) {
        radius = r;
    }

    public String display() {
        return "Radius of circle: " + radius + " cm\n" +
               "Area of circle: " + areaOfCircle() + " sq.cm\n" +
               "Circumference of circle: " + circumferenceOfCircle() + " cm";
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.initializeValues(10);
        System.out.println(circle.display());
    }
}

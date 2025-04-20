package methods;

public class Circle {
    static final double PI = 3.14159; // Defining a static constant for PI
    double radius;

    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }

    public void calculateCircumference() {
        double circumference = 2 * PI * radius;
        System.out.println("Circumference of the Circle: " + circumference);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        
        circle.radius = 5.0; // Assigning a value to radius
        
        circle.calculateArea();
        circle.calculateCircumference();
    }
}

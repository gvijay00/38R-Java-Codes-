package seperate_initilization;

public class Circle {
    // Constant value for PI
    static double PI = 3.14159;
    
    // Variable to store the radius of the circle
    double radius;

    // Method to initialize the radius
    public void initializeRadius(double r) {
        radius = r;
    }

    // Method to calculate and print the area of the circle
    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }

    // Method to calculate and print the circumference of the circle
    public void calculateCircumference() {
        double circumference = 2 * PI * radius;
        System.out.println("Circumference of the Circle: " + circumference);
    }

    public static void main(String[] args) {
        // Creating an instance of Circle
        Circle circle = new Circle();
        
        // Initializing the circle's radius
        circle.initializeRadius(5.0);
        
        // Printing circle details
        System.out.println("Circle Details:");
        System.out.println("Radius: " + circle.radius);
        
        // Calculating and displaying area and circumference
        circle.calculateArea();
        circle.calculateCircumference();
    }
}

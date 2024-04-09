class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        double radius = 5.0;
        Circle circle = new Circle(radius);
        System.out.println("Area of circle with radius " + radius + " is: " + circle.calculateArea());
    }
}

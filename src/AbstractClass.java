abstract class Shape {
    protected double area;

    public abstract void calculateArea();

    public void displayArea() {
        System.out.println("The area is: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        area = length * width;
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.calculateArea();
        circle.displayArea();

        Rectangle rect = new Rectangle(10.0, 20.0);
        rect.calculateArea();
        rect.displayArea();

    }
}

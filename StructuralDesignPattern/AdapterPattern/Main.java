package StructuralDesignPattern.AdapterPattern;

public class Main {
    public static void main(String[] args) {
        // Using existing Rectangle class
        Shape rectangle = new Rectangle(5, 4);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        // Using CircleAdapter to adapt Circle class to Shape interface
        Circle circle = new Circle(3);
        Shape circleAdapter = new CircleAdapter(circle);
        System.out.println("Area of Circle: " + circleAdapter.calculateArea());
    }
}
package StructuralDesignPattern.AdapterPattern;

public class CircleAdapter implements Shape {
    private Circle circle;

    public CircleAdapter(Circle circle) {
        this.circle = circle;
    }

    @Override
    public double calculateArea() {
        return circle.calculateArea();
    }
}
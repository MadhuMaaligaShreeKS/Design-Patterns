// package Creational Design Patterns.Abstract factory;
// import CreationalDesignPatterns.AbstractFactory.ShapeFactory.java;


public class Main1{
    public static void main(String[] args) {
        // Create a circle
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();
        
        // Create a square
        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.draw();
        
        // Create a triangle
        ShapeFactory triangleFactory = new TriangleFactory();
        Shape triangle = triangleFactory.createShape();
        triangle.draw();
    }
}
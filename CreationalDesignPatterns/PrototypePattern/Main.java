package CreationalDesignPatterns.PrototypePattern;

public class Main {
    public static void main(String[] args) {
        // Create a prototype shape
        Shape circlePrototype = new Circle();   

        // Clone the prototype to create a new shape
        Shape clonedShape = circlePrototype.clone();

        // Draw the cloned shape
        clonedShape.draw();
        
        Shape sq=new Square();
        Shape clo=sq.clone();
        clo.draw();
    }
}

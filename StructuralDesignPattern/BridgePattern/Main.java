package StructuralDesignPattern.BridgePattern;

public class Main {
    public static void main(String[] args) {
      Shape redCircle = new Circle(new Red());
      System.out.println(redCircle.draw()); // Output: Drawing a Red circle
  
      Shape blueSquare = new Square(new Blue());
      System.out.println(blueSquare.draw()); // Output: Drawing a Blue square
    }
  }
  
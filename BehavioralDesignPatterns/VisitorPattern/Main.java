package BehavioralDesignPatterns.VisitorPattern;

public class Main {
    public static void main(String[] args) {
      Square square = new Square(5);
      Circle circle = new Circle(3);
  
      Area areaCalculator = new Area();
      Perimeter perimeterCalculator = new Perimeter();
  
      square.accept(areaCalculator);
      circle.accept(areaCalculator);
  
      square.accept(perimeterCalculator);
      circle.accept(perimeterCalculator);
    }
  }
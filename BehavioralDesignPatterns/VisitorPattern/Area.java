package BehavioralDesignPatterns.VisitorPattern;

class Area implements Visitor {
    @Override
    public void visit(Square square) {
      System.out.println("Area of Square: " + square.side * square.side);
    }
  
    @Override
    public void visit(Circle circle) {
      System.out.println("Area of Circle: " + Math.PI * circle.radius * circle.radius);
    }
  }
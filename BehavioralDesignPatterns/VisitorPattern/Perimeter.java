package BehavioralDesignPatterns.VisitorPattern;

class Perimeter implements Visitor {
    @Override
    public void visit(Square square) {
      System.out.println("Perimeter of Square: " + 4 * square.side);
    }
  
    @Override
    public void visit(Circle circle) {
      System.out.println("Perimeter of Circle: " + 2 * Math.PI * circle.radius);
    }
  }
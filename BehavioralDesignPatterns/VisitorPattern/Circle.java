package BehavioralDesignPatterns.VisitorPattern;

class Circle implements Shape {
    int radius;
  
    Circle(int radius) {
      this.radius = radius;
    }
  
    @Override
    public void accept(Visitor visitor) {
      visitor.visit(this);
    }
  }
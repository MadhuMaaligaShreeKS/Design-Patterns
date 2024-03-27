package BehavioralDesignPatterns.VisitorPattern;

class Square implements Shape {
    int side;
  
    Square(int side) {
      this.side = side;
    }
  
    @Override
    public void accept(Visitor visitor) {
      visitor.visit(this);
    }
  }
  
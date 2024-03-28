package StructuralDesignPattern.BridgePattern;

class Square extends Shape {
    public Square(Color color) {
      super(color);
    }
  
    @Override
    public String draw() {
      return "Drawing a " + color.getColor() + " square";
    }
  }
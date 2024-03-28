package StructuralDesignPattern.BridgePattern;

class Circle extends Shape {
    public Circle(Color color) {
      super(color);
    }
  
    @Override
    public String draw() {
      return "Drawing a " + color.getColor() + " circle";
    }
  }
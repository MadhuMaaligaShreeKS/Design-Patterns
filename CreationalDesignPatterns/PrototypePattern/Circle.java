package CreationalDesignPatterns.PrototypePattern;

class Circle implements Shape {
    @Override
    public Shape clone() {
        return new Circle();
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

package CreationalDesignPatterns.PrototypePattern;

class Square implements Shape {
    @Override
    public Shape clone() {
        return new Square();
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}


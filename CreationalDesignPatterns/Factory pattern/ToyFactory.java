//create a toyfactory
class ToyFactory {
    public Toy createToy(String type) {
        // Factory method to create toy objects based on the given type
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "doll":
                return new Doll();
            case "actionfigure":
                return new ActionFigure();
            // Handling invalid toy types
            default: 
                throw new IllegalArgumentException("Invalid toy type: " + type);
        }
    }
}

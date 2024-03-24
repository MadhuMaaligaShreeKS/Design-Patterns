class ToyFactory {
    public Toy createToy(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "doll":
                return new Doll();
            case "actionfigure":
                return new ActionFigure();
            default:
                throw new IllegalArgumentException("Invalid toy type: " + type);
        }
    }
}

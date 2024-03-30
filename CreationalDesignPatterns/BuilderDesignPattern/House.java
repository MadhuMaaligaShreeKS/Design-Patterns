package CreationalDesignPatterns.BuilderDesignPattern;
// House - The product class
class House {
    private int floors;
    private boolean hasGarage;
    private boolean hasGarden;
 // Constructor initializes the House object with specified properties
    public House(int floors, boolean hasGarage, boolean hasGarden) {
        this.floors = floors;
        this.hasGarage = hasGarage;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", hasGarage=" + hasGarage +
                ", hasGarden=" + hasGarden +
                '}';
    }
}

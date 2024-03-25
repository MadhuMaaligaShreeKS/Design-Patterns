package CreationalDesignPatterns.BuilderDesignPattern;

class House {
    private int floors;
    private boolean hasGarage;
    private boolean hasGarden;

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

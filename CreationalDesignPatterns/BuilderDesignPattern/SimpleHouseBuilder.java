package CreationalDesignPatterns.BuilderDesignPattern;

class SimpleHouseBuilder implements HouseBuilder {
    private int floors;
    private boolean hasGarage;
    private boolean hasGarden;

    @Override
    public void buildFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void buildGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    @Override
    public void buildGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public House build() {
        return new House(floors, hasGarage, hasGarden);
    }
}

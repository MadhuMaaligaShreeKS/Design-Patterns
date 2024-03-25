package CreationalDesignPatterns.BuilderDesignPattern;

class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House construct() {
        houseBuilder.buildFloors(2); // Example configuration
        houseBuilder.buildGarage(true);
        houseBuilder.buildGarden(true);
        return houseBuilder.build();
    }
}

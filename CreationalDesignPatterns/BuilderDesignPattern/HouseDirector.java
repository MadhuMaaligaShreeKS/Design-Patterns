package CreationalDesignPatterns.BuilderDesignPattern;
//Director class
class HouseDirector {
    private HouseBuilder houseBuilder;
// Constructor to set the HouseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
// Method to construct a House object
    public House construct() {
        houseBuilder.buildFloors(2); // Example configuration
        houseBuilder.buildGarage(true);
        houseBuilder.buildGarden(true);
        return houseBuilder.build();
    }
}

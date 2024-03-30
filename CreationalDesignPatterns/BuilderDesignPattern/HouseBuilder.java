package CreationalDesignPatterns.BuilderDesignPattern;
//The abstract builder
interface HouseBuilder {
    void buildFloors(int floors);
    void buildGarage(boolean hasGarage);
    void buildGarden(boolean hasGarden);
    House build();  // Method to retrieve the constructed House object
}


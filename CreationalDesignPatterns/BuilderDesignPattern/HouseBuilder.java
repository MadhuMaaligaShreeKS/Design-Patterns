package CreationalDesignPatterns.BuilderDesignPattern;
interface HouseBuilder {
    void buildFloors(int floors);
    void buildGarage(boolean hasGarage);
    void buildGarden(boolean hasGarden);
    House build();
}


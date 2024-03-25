package CreationalDesignPatterns.BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        HouseBuilder builder = new SimpleHouseBuilder();
        HouseDirector director = new HouseDirector(builder);
        House house = director.construct();
        System.out.println(house);
    }
}


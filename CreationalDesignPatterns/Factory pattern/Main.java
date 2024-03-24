public class Main {
    public static void main(String[] args) {
        ToyFactory toyFactory = new ToyFactory();

        // Buying toys
        Toy carToy = toyFactory.createToy("car");
        carToy.play();

        Toy dollToy = toyFactory.createToy("doll");
        dollToy.play();

        Toy actionFigureToy = toyFactory.createToy("actionfigure");
        actionFigureToy.play();
    }
}

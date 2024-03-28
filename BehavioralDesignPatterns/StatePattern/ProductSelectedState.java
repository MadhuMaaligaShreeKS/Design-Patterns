package BehavioralDesignPatterns.StatePattern;

class ProductSelectedState implements State {
    @Override
    public void selectProduct() {
        System.out.println("Product already selected");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product dispensed");
    }
}
package BehavioralDesignPatterns.StatePattern;

class ProductDeliveredState implements State {
    @Override
    public void selectProduct() {
        System.out.println("Cannot select another product, already delivered");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product already dispensed");
    }
}
package BehavioralDesignPatterns.StatePattern;

class NoSelectionState implements State {
    @Override
    public void selectProduct() {
        System.out.println("Product selected");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select a product first");
    }
}
package BehavioralDesignPatterns.StatePattern;

class VendingMachine {
    private State currentState;

    public VendingMachine() {
        currentState = new NoSelectionState();
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    public void selectProduct() {
        currentState.selectProduct();
    }

    public void dispenseProduct() {
        currentState.dispenseProduct();
    }
}

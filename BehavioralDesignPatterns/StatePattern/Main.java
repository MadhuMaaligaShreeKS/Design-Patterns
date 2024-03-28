package BehavioralDesignPatterns.StatePattern;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectProduct(); // NoSelectionState
        vendingMachine.dispenseProduct(); // Please select a product first

        vendingMachine.setCurrentState(new ProductSelectedState());
        vendingMachine.selectProduct(); // Product already selected
        vendingMachine.dispenseProduct(); // Product dispensed

        vendingMachine.setCurrentState(new ProductDeliveredState());
        vendingMachine.selectProduct(); // Cannot select another product, already delivered
        vendingMachine.dispenseProduct(); // Product already dispensed
    }
}

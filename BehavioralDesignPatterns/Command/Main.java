package BehavioralDesignPatterns.Command;

public class Main {
    public static void main(String[] args) {
        // Create receiver
        Chef chef = new Chef();

        // Create concrete command objects
        PizzaOrder pizzaOrder = new PizzaOrder(chef);
        BurgerOrder burgerOrder = new BurgerOrder(chef);

        // Create invoker
        Waiter waiter = new Waiter();

        // Set commands and execute
        waiter.takeOrder(pizzaOrder);
        waiter.placeOrder();

        waiter.takeOrder(burgerOrder);
        waiter.placeOrder();
    }
}

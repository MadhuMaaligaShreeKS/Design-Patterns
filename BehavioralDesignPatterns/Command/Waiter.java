package BehavioralDesignPatterns.Command;

class Waiter {
    private Order order;

    void takeOrder(Order order) {
        this.order = order;
    }

    void placeOrder() {
        order.execute();
    }
}
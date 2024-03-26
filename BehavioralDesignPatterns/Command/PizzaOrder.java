package BehavioralDesignPatterns.Command;

class PizzaOrder implements Order {
    private Chef chef;

    PizzaOrder(Chef chef) {
        this.chef = chef;
    }

    public void execute() {
        chef.cookPizza();
    }
}
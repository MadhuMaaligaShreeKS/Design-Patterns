package BehavioralDesignPatterns.Command;

class BurgerOrder implements Order {
    private Chef chef;

    BurgerOrder(Chef chef) {
        this.chef = chef;
    }

    public void execute() {
        chef.cookBurger();
    }
}
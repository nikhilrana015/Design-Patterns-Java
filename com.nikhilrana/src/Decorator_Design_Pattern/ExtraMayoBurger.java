package Decorator_Design_Pattern;

public class ExtraMayoBurger extends BurgerDecorator {
    private Burger burger;
    public ExtraMayoBurger(Burger burger) {
        this.burger = burger;
    }
    @Override
    public String getDescription() {
        return burger.getDescription() + " with extra mayo";
    }
    @Override
    public double getCost() {
        return burger.getCost() + 99.99;
    }
}

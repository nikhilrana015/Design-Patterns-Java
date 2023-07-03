package Decorator_Design_Pattern;

public class ExtraTandooriSauceBurger extends BurgerDecorator {
    private Burger burger;
    public ExtraTandooriSauceBurger(Burger burger) {
        this.burger = burger;
    }
    @Override
    public String getDescription() {
        return burger.getDescription() + " with extra tandoori sauce";
    }
    @Override
    public double getCost() {
        return burger.getCost() + 89.75;
    }
}

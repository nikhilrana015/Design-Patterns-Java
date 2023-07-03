package Decorator_Design_Pattern;

public class ZingerBurger extends Burger {
    @Override
    public String getDescription() {
        return "Zinger Burger";
    }

    @Override
    public double getCost() {
        return 199.50;
    }
}

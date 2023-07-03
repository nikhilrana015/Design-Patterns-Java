package Decorator_Design_Pattern;

abstract public class Burger {
    private String description;
    private double cost;
    abstract public String getDescription();
    abstract public double getCost();
}

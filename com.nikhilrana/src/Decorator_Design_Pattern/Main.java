package Decorator_Design_Pattern;

public class Main {
    public static void main(String[] args) {

        // Achieving the runtime polymorphism

        Burger burger1 = new ZingerBurger();
        System.out.println("** Normal Burger **");
        System.out.println(burger1.getDescription());
        System.out.println(burger1.getCost());


        Burger burger2 = new ExtraCheeseBurger(new ZingerBurger());
        System.out.println("** Adding 1-topping for burger using decorator **");
        System.out.println(burger2.getDescription());
        System.out.println(burger2.getCost());


        Burger burger3 = new ExtraTandooriSauceBurger(new ExtraCheeseBurger(new ZingerBurger()));
        System.out.println("** Adding 2-toppings for burger using decorator **");
        System.out.println(burger3.getDescription());
        System.out.println(burger3.getCost());
    }
}

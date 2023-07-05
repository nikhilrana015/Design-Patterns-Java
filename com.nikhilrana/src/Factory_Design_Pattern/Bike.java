package Factory_Design_Pattern;

public class Bike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike engine started...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike engine stopped...");
    }
}

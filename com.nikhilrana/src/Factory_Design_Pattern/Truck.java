package Factory_Design_Pattern;

public class Truck implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Truck engine started...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped...");
    }
}

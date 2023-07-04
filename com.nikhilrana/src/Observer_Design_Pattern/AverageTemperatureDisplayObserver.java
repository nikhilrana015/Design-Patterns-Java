package Observer_Design_Pattern;

public class AverageTemperatureDisplayObserver implements Observer {
    private int sumOfTemperatures;
    private int totalTemperatures;
    public AverageTemperatureDisplayObserver(Observable observable) {
        observable.registerObserver(this);
        this.sumOfTemperatures = 0;
        this.totalTemperatures = 0;
    }
    @Override
    public void update(int temperature, int humidity) {
        sumOfTemperatures += temperature;
        totalTemperatures++;
        display();
    }
    public void display() {
        System.out.println("Average temperature for " + totalTemperatures + " records are: " + sumOfTemperatures/(float)totalTemperatures);
    }
}

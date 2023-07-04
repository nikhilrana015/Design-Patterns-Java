package Observer_Design_Pattern;

public class CurrentWeatherConditionsDisplayObserver implements Observer{
    private int temperature;
    private int humidity;
    public CurrentWeatherConditionsDisplayObserver(Observable observable) {
        observable.registerObserver(this);
        this.temperature = 0;
        this.humidity = 0;
    }

    @Override
    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    public void display() {
        System.out.println("Current weather conditions are:");
        System.out.println("Temperature: " + this.temperature);
        System.out.println("Humidity: " + this.humidity);
    }
}

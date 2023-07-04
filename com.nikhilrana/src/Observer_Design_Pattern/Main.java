package Observer_Design_Pattern;

public class Main {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        AverageTemperatureDisplayObserver averageTemperatureDisplayObserver = new AverageTemperatureDisplayObserver(weatherStation);
        CurrentWeatherConditionsDisplayObserver currentWeatherConditionsDisplayObserver = new CurrentWeatherConditionsDisplayObserver(weatherStation);

        weatherStation.parametersChanged(10,10);
        weatherStation.parametersChanged(20,20);

    }
}

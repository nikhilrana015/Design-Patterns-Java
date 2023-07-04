package Observer_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    private List<Observer> observerList;
    private int temperature;
    private int humidity;
    public WeatherStation() {
        this.observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if(index>=0)
            observerList.remove(index);
    }
    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(temperature, humidity));
    }
    public void parametersChanged(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

}

package observer.smarthomeexample;

import java.util.ArrayList;

public class SensorSystem implements Observable{

    private ArrayList<Observer> sensors;

    public SensorSystem() {
        this.sensors = new ArrayList<>();
    }


    @Override
    public void addObserver(Observer sensor) {
        sensors.add(sensor);
    }

    @Override
    public void removeObserver(Observer sensor) {
        sensors.remove(sensor);
    }

    @Override
    public void notifyObservers() {
        for(Observer sensor : sensors) {
            sensor.update();
        }
    }
}

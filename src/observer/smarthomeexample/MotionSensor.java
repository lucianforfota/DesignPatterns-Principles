package observer.smarthomeexample;

public class MotionSensor extends Sensor implements Observer{

    private int activationDistance;

    private int currentDistance;

    public MotionSensor(String name, int activationDistance) {
        super(name);
        this.activationDistance = activationDistance;
        this.currentDistance = 0;
    }

    public int getActivationDistance() {
        return activationDistance;
    }

    public void setActivationDistance(int activationDistance) {
        this.activationDistance = activationDistance;
    }

    public int getCurrentDistance() {
        return currentDistance;
    }

    public void setCurrentDistance(int currentDistance) {
        this.currentDistance = currentDistance;
    }

    @Override
    public void update() {
        if (currentDistance<activationDistance){
            System.out.println("scoatem pistolul");
        }
    }
}

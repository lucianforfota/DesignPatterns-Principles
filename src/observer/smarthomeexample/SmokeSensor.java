package observer.smarthomeexample;

public class SmokeSensor extends Sensor implements Observer{
    private final int activationVolume;

    private int currentVolume;

    public SmokeSensor(String name, int activationVolume) {
        super(name);
        this.activationVolume = activationVolume;
        this.currentVolume = 0;
    }

    public int getActivationVolume() {
        return activationVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    @Override
    public void update() {
        if (currentVolume>activationVolume) {
            System.out.println("s-a detectat fum");
        }
    }
}

package solidempty.dip.demo.car.dirty;

public class Car {

    private DieselEngine dieselEngine;

    public Car(DieselEngine e) {
        dieselEngine = e;
    }

    public void start() {
        dieselEngine.start();
        //blblblblb alte chestii
    }
}

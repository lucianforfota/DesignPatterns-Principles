package solidempty.dip.demo.car.refactored;

public class Car {

    private Engine engine;

    public Car(Engine e) {
        engine = e;
    }

    public void start() {
        engine.start();
        //blblblblb alte chestii
    }
}

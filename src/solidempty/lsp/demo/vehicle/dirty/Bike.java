package solidempty.lsp.demo.vehicle.dirty;

public class Bike implements Vehicle {


    @Override
    public void startEngine() {
        throw new AssertionError("I don't have an engine!");
    }

    @Override
    public void accelerate() {
        //accelerate bike
    }
}

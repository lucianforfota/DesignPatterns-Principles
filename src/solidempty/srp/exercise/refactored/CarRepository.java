package solidempty.srp.exercise.refactored;

import java.util.Arrays;
import java.util.List;

public class CarRepository {

    private List<Car> carsDb;


    public CarRepository() {
        this.carsDb = Arrays
                .asList(new Car("1", "Golf III", "Volkswagen", 25000), new Car("2", "Multipla", "Fiat", 15000),
                        new Car("3", "Megane", "Renault", 17000));
    }

    public Car getFromDb(String carId) {
        for (Car car : carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> findAll(){
        return this.carsDb;
    }


}

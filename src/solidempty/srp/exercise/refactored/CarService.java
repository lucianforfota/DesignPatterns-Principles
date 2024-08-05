package solidempty.srp.exercise.refactored;

import java.util.List;

public class CarService {

    CarRepository carRepository;


    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        List<Car> cars = carRepository.findAll();
        for (Car car : cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car findMostExpensiveCar() {
        Car bestCar = null;
        List<Car> cars = carRepository.findAll();
        for (Car car : cars) {
            if (bestCar == null || car.getPrice()> bestCar.getPrice()) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}

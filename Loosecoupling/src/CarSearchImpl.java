
import java.util.List;
import model.Car;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MERT
 */
public class CarSearchImpl {

   
    private FixEmptyChassis fixEmptyChassis;

    public CarSearchImpl(FixEmptyChassis fixEmptyChassis) {
        this.fixEmptyChassis = fixEmptyChassis;
    }

    public Car getLastChasses(List<Car> cars) {

        int i = cars.size() - 1;
        return cars.get(i);

    }

    public Car findCarById(List<Car> cars, int chassis) {
        for (Car car : cars) {
            if (car.getChassis() == chassis) {
                return car;
            }
        }
        return null;
        
    }
    
    
    
    }

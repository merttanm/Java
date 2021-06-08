
import java.util.Collections;
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
public class BetterWayToRemoveEmptyChassis implements FixEmptyChassis {

    public List<Car> removeEmptyChassis(List<Car> cars) {
        Collections.sort(cars);
        int i = 0;
        for (Car car : cars) {
           car.setChassis(i++);
            
        }
        return cars;
    }

}

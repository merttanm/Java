
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
public class RemoveEmptyChassisAlgorithm implements FixEmptyChassis {

    public List<Car> removeEmptyChassis(List<Car> cars) {

        Collections.sort(cars);

        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).setChassis(i);

        }
        return cars;
    }

}

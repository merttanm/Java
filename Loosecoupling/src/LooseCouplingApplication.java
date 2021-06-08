
import java.util.ArrayList;
import java.util.List;
import model.Car;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;*/
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author MERT
 */
public class LooseCouplingApplication {

    static Car bmw = new Car(1, "BMW");
    static Car mercedes = new Car(2, "BMW");
    static Car audi = new Car(3, "BMW");

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(bmw);
        cars.add(mercedes);
        cars.add(audi);

     /*   ConfigurableApplicationContext applicationContext = SpringApplication.run(LooseCouplingApplication.class, args);
        CarSearchImpl classSearch = applicationContext.getBean(CarSearchImpl.class);

        Car oldLast = classSearch.getLastChasses(cars);
        Car oldResult = classSearch.findCarById(cars, 1);

        Car last = classSearch.getLastChasses(cars);
        Car result = classSearch.findCarById(cars, 1);

        System.out.println(oldLast);
        System.out.println(oldResult);

        System.out.println(last);
        System.out.println(result);*/

    }

}

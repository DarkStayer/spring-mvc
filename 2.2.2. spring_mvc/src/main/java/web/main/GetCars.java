package web.main;

import java.util.ArrayList;
import java.util.List;

public class GetCars {
    public static List<Car> getCars (Integer value){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car ("Mazda", "CX7", "red"));
        cars.add(new Car ("Nissan", "Note", "blue"));
        cars.add(new Car ("Toyota", "Mark2", "white"));
        cars.add(new Car ("Bentley", "Continental", "black"));
        cars.add (new Car ("Toyota", "LandCruiser", "green"));

        if (value==null||value<=0||value>=5) {
            return cars;
        }else {
            List <Car> carResult = new ArrayList<>();
            for (int i =0; i<value;i++){
                carResult.add(cars.get(i));
            }
            return carResult;
        }
    }
}

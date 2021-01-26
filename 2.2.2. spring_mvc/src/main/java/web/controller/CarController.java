package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam (value = "count", required = false) Integer number, Model model) {
        List<String> cars = new ArrayList<>();
        cars.add("Mazda");
        cars.add("Toyota");
        cars.add("Volvo");
        cars.add("Nissan");
        cars.add ("VAZ");
        if (number==null||number<=0||number>=5) {
            model.addAttribute("cars", cars);
        }else {
            List <String> carResult = new ArrayList<>();
            for (int i =0; i<number;i++){
                carResult.add(cars.get(i));
                model.addAttribute("cars", carResult);
            }
        }

        return "cars";
    }
}

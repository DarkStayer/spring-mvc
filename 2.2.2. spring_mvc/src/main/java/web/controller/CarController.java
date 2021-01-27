package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam (value = "count", required = false) Integer number, Model model) {
        CarService carService = new CarServiceImpl();
        List<Car> cars = carService.getCars(number);
        model.addAttribute("cars",cars);
        return "cars";
    }
}

package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.main.Car;
import web.main.GetCars;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam (value = "count", required = false) Integer number, Model model) {
        List <Car> cars = GetCars.getCars(number);
        model.addAttribute("cars",cars);

        return "cars";
    }
}

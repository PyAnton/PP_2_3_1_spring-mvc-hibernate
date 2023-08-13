package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(name = "count", defaultValue = "5") int count, Model model){
        List<Car> listCars = new ArrayList<>(10);
        listCars.add(new Car("BMW","5M",15000.0));
        listCars.add(new Car("LADA","PRIORA",3000.0));
        listCars.add(new Car("AUDI","Q5",12000.0));
        listCars.add(new Car("TOYOTA","CROWN",9000.0));
        listCars.add(new Car("BMW","3",11000.0));
        List<Car> carsToShow;

        if (count >= 5) {
            carsToShow = listCars;
        } else {
            carsToShow = listCars.subList(0, Math.min(count, listCars.size()));
        }

        model.addAttribute("cars", carsToShow);
        return "cars";
    }
}

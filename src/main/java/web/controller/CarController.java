package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping( "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5")
                               int allCars, Model model){
        List<Car> list = new ArrayList<>();
        list.add(new Car(1,"Audi", 3));
        list.add(new Car(2, "Ferrari", 5));
        list.add(new Car(3, "Nissan", 3));
        list.add(new Car(4, "Ford", 7));
        list.add(new Car(5, "FIAT", 6));

        list = carService.getCars(list, allCars);
        model.addAttribute("list", list);
        return "car";
    }

}

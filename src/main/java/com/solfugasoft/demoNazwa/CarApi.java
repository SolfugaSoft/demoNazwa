package com.solfugasoft.demoNazwa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarApi {


    private CarManager carManager;


    @Autowired
    public CarApi(CarManager carManager) {
        this.carManager = carManager;
    }

    @GetMapping("/sayhello")
    public String main(@RequestParam String name) {
        return "Hello " + name;
    }


    @PostMapping("/addcar")
    public boolean addCar(@RequestBody Car car) {
        return carManager.addCar(car);
    }



}

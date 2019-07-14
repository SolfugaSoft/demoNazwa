package com.solfugasoft.demoNazwa;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager {

    private List<Car>carList;

    public CarManager() {
        this.carList =  new ArrayList<>();
        carList.add(new Car("polo","WV"));
        carList.add(new Car("126p","Fiat"));
    }

    public  boolean addCar(Car car){
        return carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}

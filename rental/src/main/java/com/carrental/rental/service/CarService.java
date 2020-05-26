package com.carrental.rental.service;

import com.carrental.rental.entity.Car;
import com.carrental.rental.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

//    public List<Car> getAllCars() {
//        return carRepository.findAll();
//    }


    public Boolean addCar(Car car) {
        carRepository.save(car);
        return true;
    }
}

package com.carrental.rental.service;

import com.carrental.rental.entity.Car;
import com.carrental.rental.model.CarStatus;
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

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Boolean addCar(Car car) {
        carRepository.save(car);
        return true;
    }

    public void changeCarMileage(Long carId, Integer mileage) {
        Car car = carRepository.findCarByCarId(carId);

        if (car != null) {
            car.setMileage(mileage);
            carRepository.save(car);
        }
    }

    public void changeCarStatus(Long carId, CarStatus status) {
        Car car = carRepository.findCarByCarId(carId);
        car.setStatus(status.isStatus());
    }

    public void changeCarPrice (Long id, Integer newPrice) {
        Car car = carRepository.findCarByCarId(id);
        car.setPricePerDay(newPrice);
    }

}

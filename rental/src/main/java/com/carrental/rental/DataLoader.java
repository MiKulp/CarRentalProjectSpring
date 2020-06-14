package com.carrental.rental;

import com.carrental.rental.entity.Car;
import com.carrental.rental.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Car car = new Car("Toyota",
                "Corolla",
                "Sedan",
                "2019",
                "red",
                190000,
                false,
                250);

        carRepository.save(car);
    }

}

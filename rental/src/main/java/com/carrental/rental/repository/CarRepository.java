package com.carrental.rental.repository;

import com.carrental.rental.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    Car findCarByCarId(Long id);
}

package com.carrental.rental.controller;

import com.carrental.rental.entity.Car;
import com.carrental.rental.repository.CarRepository;
import com.carrental.rental.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarConrtroller {

    @Autowired
    CarService carService;


}

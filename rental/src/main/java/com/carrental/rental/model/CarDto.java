package com.carrental.rental.model;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class CarDto {

    @Size(min = 5, max = 25)
    private String carMake;

    @Size (min = 5, max = 25)
    private String carModel;

    @Size (min = 5, max = 25)
    private String bodyType;

    @Size (min = 5, max = 25)
    private String vintage;

    @Size (min = 5, max = 25)
    private String colour;

    @Size (min = 5, max = 25)
    private String mileage;

    private Boolean status;

    private Integer pricePerDay;
}

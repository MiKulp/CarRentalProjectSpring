package com.carrental.rental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.crypto.NullCipher;
import javax.persistence.*;

@Entity


public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long carId;

    @Column(nullable = false)
    private String carMake;

    @Column(nullable = false)
    private String carModel;

    @Column(nullable = false)
    private String bodyType;

    @Column(nullable = false)
    private String vintage;

    @Column(nullable = false)
    private String colour;

    private Integer mileage;

    @Column(nullable = false)
    private Boolean status;

    @Column(nullable = false)
    private Integer pricePerDay;

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getVintage() {
        return vintage;
    }

    public void setVintage(String vintage) {
        this.vintage = vintage;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Integer pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Car() {
    }

    public Car(String carMake,
               String carModel,
               String bodyType,
               String vintage,
               String colour,
               Integer mileage,
               Boolean status,
               Integer pricePerDay) {

        this.carMake = carMake;
        this.carModel = carModel;
        this.bodyType = bodyType;
        this.vintage = vintage;
        this.colour = colour;
        this.mileage = mileage;
        this.status = status;
        this.pricePerDay = pricePerDay;

    }
}

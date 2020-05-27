package com.carrental.rental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.crypto.NullCipher;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long carId;

    @Column (nullable = false)
    private String carMake;

    @Column (nullable = false)
    private String carModel;

    @Column (nullable = false)
    private String bodyType;

    @Column (nullable = false)
    private String vintage;

    @Column (nullable = false)
    private String colour;

    private Integer mileage;

    @Column (nullable = false)
    private Boolean status;

    @Column (nullable = false)
    private Integer pricePerDay;


}

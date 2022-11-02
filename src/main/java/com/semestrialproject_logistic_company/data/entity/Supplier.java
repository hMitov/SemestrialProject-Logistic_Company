package com.semestrialproject_logistic_company.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Supplier")
public class Supplier extends BaseEmployee {

    @Column(name = "delivery_number")
    private Long deliveryNumber;

    @Column(name = "vehicle_registration_plate")
    private String vehicleRegPlate;

    @Column(name = "driving_license_category")
    private String drivingLicenseCategory;

}
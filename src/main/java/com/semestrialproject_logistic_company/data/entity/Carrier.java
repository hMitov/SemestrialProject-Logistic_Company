package com.semestrialproject_logistic_company.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Carrier")
public class Carrier extends BaseEmployee {

    @Column(name = "deliveryNumber")
    private Long deliveryNumber;

    @Column(name = "vehicleRegistrationPlate")
    private String vehicleRegPlate;

    @Column(name = "drivingLicenseCategory")
    private String drivingLicenseCategory;

    public Carrier(Long egn, String firstName, String middleName, String lastName, Long deliveryNumber, String vehicleRegPlate, String drivingLicenseCategory) {
        super(egn, firstName, middleName, lastName);
        this.deliveryNumber = deliveryNumber;
        this.vehicleRegPlate = vehicleRegPlate;
        this.drivingLicenseCategory = drivingLicenseCategory;
    }

    public Carrier(Long egn, String firstName, String middleName, String lastName, double salary, Date dateOfEmploy, Long deliveryNumber, String vehicleRegPlate, String drivingLicenseCategory) {
        super(egn, firstName, middleName, lastName, salary, dateOfEmploy);
        this.deliveryNumber = deliveryNumber;
        this.vehicleRegPlate = vehicleRegPlate;
        this.drivingLicenseCategory = drivingLicenseCategory;
    }
}

package com.semestrialproject_logistic_company.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "office_employee")
public class OfficeEmployee extends BaseEmployee {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "registrant")
    private Set<Shipment> registeredShipments;

    public OfficeEmployee(Long egn, String firstName, String middleName, String lastName, double salary, Date dateOfEmployee) {
    }
}

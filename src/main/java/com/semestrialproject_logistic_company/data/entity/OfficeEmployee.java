package com.semestrialproject_logistic_company.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Office_Employee")
public class OfficeEmployee extends BaseEmployee {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "registrant")
    private Set<Shipment> registeredShipments;

}
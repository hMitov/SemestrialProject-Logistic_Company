package com.semestrialproject_logistic_company.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "recipient")
public class Recipient extends BaseClient {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipient")
    private Set<Shipment> receivedShipments;

}

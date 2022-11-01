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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Sender")
public class Sender extends BaseClient {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sender")
    private Set<Shipment> sendShipments;

}

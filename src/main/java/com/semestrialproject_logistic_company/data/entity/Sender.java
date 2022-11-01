package com.semestrialproject_logistic_company.data.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Sender")
public class Sender extends BaseClient {

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sender")
    private Set<Shipment> sendShipments;

}

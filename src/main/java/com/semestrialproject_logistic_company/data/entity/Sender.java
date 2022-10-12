package com.semestrialproject_logistic_company.data.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Sender")
public class Sender extends BaseClient {

    @Id
    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sender")
    private Set<Shipment> sendShipments;

    public Sender(String firstName, String lastName, String address, String telephone, String email) {
        super(firstName, lastName, address);
        this.telephone = telephone;
        this.email = email;
    }
}

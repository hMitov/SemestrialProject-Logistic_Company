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
public class Sender {

    @Id
    @Column(name = "telephone")
    private String telephone;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "company")
    private String company;

    @Column(name = "email")
    private String email;

    private boolean office;

    private boolean address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sender")
    private Set<Shipment> sendShipments;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "receiver")
    private Set<Shipment> receivedShipments;

    public Sender(String telephone, String firstName, String lastName) {
        this.telephone = telephone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

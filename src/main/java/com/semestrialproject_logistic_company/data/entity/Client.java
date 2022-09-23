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
@Table(name = "Client")
public class Client {

    @Id
    @Column(name = "telephone")
    private String telephone;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @OneToMany(mappedBy = "sender")
    private Set<Shipment> sendShipments;

    @OneToMany(mappedBy = "receiver")
    private Set<Shipment> receivedShipments;

    public Client(String telephone, String firstName, String lastName) {
        this.telephone = telephone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

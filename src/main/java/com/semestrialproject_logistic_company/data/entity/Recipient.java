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
@Table(name = "recipient")
public class Recipient extends BaseClient implements Comparable<Recipient>{

    @Id
    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipient")
    private Set<Shipment> receivedShipments;

    public Recipient(String firstName, String lastName, String address, String telephone, String email) {
        super(firstName, lastName, address);
        this.telephone = telephone;
        this.email = email;
    }

    @Override
    public int compareTo(Recipient recipient) {
        return this.telephone.compareTo(recipient.telephone);
    }
}

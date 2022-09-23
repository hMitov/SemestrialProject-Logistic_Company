package com.semestrialproject_logistic_company.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "shipment")
public class Shipment implements Comparable<Shipment> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shipmentId;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "senderId")
    private Client sender;

    @ManyToOne
    @JoinColumn(name = "receiverId")
    private Client receiver;

    @Column(name = "status")
    private boolean delivered;

    @ManyToOne
    @JoinColumn(name ="registeredByEmployee")
    private OfficeEmployee registrant;

    @Override
    public int compareTo(Shipment shipment) {
        return Long.compare(this.shipmentId, shipment.shipmentId);
    }

}

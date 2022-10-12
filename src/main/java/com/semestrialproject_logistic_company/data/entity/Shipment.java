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

    @Column(name = "city")
    private String city;

    @Column(name = "toOffice")
    private boolean toOffice;

    @Column(name = "toAddress")
    private boolean toAddress;

    @Column(name = "isProcessed")
    private boolean isProcessed;

    @Column(name = "status")
    private boolean isDelivered;

    @Column(name = "weight")
    private Double weight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_telephone")
    private Sender sender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipient_telephone")
    private Recipient recipient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "registered_by_employee")
    private OfficeEmployee registrant;

    @Override
    public int compareTo(Shipment shipment) {
        return Long.compare(this.shipmentId, shipment.shipmentId);
    }

}

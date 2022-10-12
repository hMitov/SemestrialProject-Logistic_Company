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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_id")
    private Sender sender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver_id")
    private Sender receiver;

    @Column(name = "status")
    private boolean isDelivered;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "registered_by_employee")
    private OfficeEmployee registrant;

    @Override
    public int compareTo(Shipment shipment) {
        return Long.compare(this.shipmentId, shipment.shipmentId);
    }


    @Override
    public String toString() {
        return "Shipment{" +
                "shipmentId=" + shipmentId +
                ", name='" + name + '\'' +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", isDelivered=" + isDelivered +
                ", registrant=" + registrant +
                '}';
    }
}

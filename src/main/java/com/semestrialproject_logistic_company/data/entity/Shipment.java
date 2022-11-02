package com.semestrialproject_logistic_company.data.entity;

import com.semestrialproject_logistic_company.data.enums.ShipmentHeight;
import com.semestrialproject_logistic_company.data.enums.ShipmentWidth;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Shipment")
public class Shipment implements Comparable<Shipment> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "to_office")
    private boolean toOffice;

    @Column(name = "to_address")
    private boolean toAddress;

    @Column(name = "is_processed")
    private boolean isProcessed;

    @Column(name = "is_delivered")
    private boolean isDelivered;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "shipment_height")
    private ShipmentHeight shipmentHeight;

    @Column(name = "shipment_width")
    private ShipmentWidth shipmentWidth;

    @ManyToOne
    @JoinColumn(name = "sender")
    private Sender sender;

    @ManyToOne
    @JoinColumn(name = "recipient")
    private Recipient recipient;

    @ManyToOne
    @JoinColumn(name = "registered_by_employee")
    private OfficeEmployee registrant;

    @Column(name = "delivered_date_time")
    private LocalDateTime deliveredDateTime;

    @Override
    public int compareTo(Shipment shipment) {
        return Long.compare(this.id, shipment.id);
    }

}

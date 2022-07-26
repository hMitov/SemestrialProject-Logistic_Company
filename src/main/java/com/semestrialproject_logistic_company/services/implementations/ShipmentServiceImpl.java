package com.semestrialproject_logistic_company.services.implementations;
import com.semestrialproject_logistic_company.data.entity.Shipment;
import com.semestrialproject_logistic_company.data.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ShipmentServiceImpl {
    @Autowired
    private ShipmentRepository shipmentRepository;

    public Shipment saveShipment(Shipment shipment) {
        return this.shipmentRepository.saveAndFlush(shipment);
    }

    public Shipment findByShipmentId( Long id ) {
        return this.shipmentRepository.findByShipmentId( id );
    }
}

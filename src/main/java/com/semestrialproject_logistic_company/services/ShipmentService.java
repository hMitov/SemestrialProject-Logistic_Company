package com.semestrialproject_logistic_company.services;

import com.semestrialproject_logistic_company.data.entity.Shipment;

public interface ShipmentService {

    Shipment saveShipment(Shipment shipment );

    Shipment findByShipmentId( Long id );
}

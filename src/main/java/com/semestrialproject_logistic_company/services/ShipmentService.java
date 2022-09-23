package com.semestrialproject_logistic_company.services;

import com.semestrialproject_logistic_company.data.entity.OfficeEmployee;
import com.semestrialproject_logistic_company.data.entity.Shipment;

import java.util.List;

public interface ShipmentService {

    Shipment saveShipment(Shipment shipment);

    Shipment getShipment(Long id);

    List<Shipment> findShipmentsByRegistrant(OfficeEmployee registrant);

}

package com.semestrialproject_logistic_company.services;

import com.semestrialproject_logistic_company.data.entity.Shipment;
import com.semestrialproject_logistic_company.data.projections.ShipmentApi;

import java.util.List;

public interface ShipmentService {

    Shipment saveShipment(Shipment shipment);

    ShipmentApi getShipment(Long id);

    List<ShipmentApi> getShipments();

//    List<Shipment> findShipmentsByRegistrant(OfficeEmployee registrant);

}

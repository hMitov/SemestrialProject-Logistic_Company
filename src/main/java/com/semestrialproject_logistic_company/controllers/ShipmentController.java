package com.semestrialproject_logistic_company.controllers;

import com.semestrialproject_logistic_company.data.entity.Shipment;
import com.semestrialproject_logistic_company.services.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipmentController {

    @Autowired
    ShipmentService shipmentService;

    @GetMapping("shipments/{id}")
    public Shipment getShipment(@PathVariable Long id) {
        return shipmentService.getShipment(id);
    }

}

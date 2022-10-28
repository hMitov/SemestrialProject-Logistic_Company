package com.semestrialproject_logistic_company.services.implementations;

import com.semestrialproject_logistic_company.data.entity.Shipment;
import com.semestrialproject_logistic_company.data.projections.ShipmentApi;
import com.semestrialproject_logistic_company.data.repository.ShipmentRepository;
import com.semestrialproject_logistic_company.services.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    public Shipment saveShipment(Shipment shipment) {
        return this.shipmentRepository.saveAndFlush(shipment);
    }

    public ShipmentApi getShipment(Long id) {
        return this.shipmentRepository.findShipmentsByShipmentId(id);
    }

    public List<ShipmentApi> getShipments() {
        return this.shipmentRepository.findAllBy();
    }

}

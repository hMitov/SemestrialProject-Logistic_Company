package com.semestrialproject_logistic_company.services.implementations;

import com.semestrialproject_logistic_company.data.entity.OfficeEmployee;
import com.semestrialproject_logistic_company.data.entity.Recipient;
import com.semestrialproject_logistic_company.data.entity.Sender;
import com.semestrialproject_logistic_company.data.entity.Shipment;
import com.semestrialproject_logistic_company.data.projections.ShipmentApi;
import com.semestrialproject_logistic_company.data.repository.ShipmentRepository;
import com.semestrialproject_logistic_company.services.ShipmentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipmentRepository;

    @Override
    public Shipment saveShipment(Shipment shipment) {
        return this.shipmentRepository.saveAndFlush(shipment);
    }

    @Override
    public ShipmentApi getShipment(Long id) {
        return this.shipmentRepository.findShipmentsByShipmentId(id);
    }

    @Override
    public List<ShipmentApi> getShipments() {
        return this.shipmentRepository.findAllBy();
    }

    @Override
    public List<ShipmentApi> getShipmentsByRegistrant(OfficeEmployee registrant) {
        return this.shipmentRepository.findShipmentsByRegistrant(registrant);
    }

    @Override
    public void deleteShipment(Long id) {
        this.shipmentRepository.deleteById(id);
    }

    @Override
    public List<ShipmentApi> getShipmentsBySender(Sender sender) {
        return this.shipmentRepository.findShipmentsBySender(sender);
    }

    @Override
    public List<ShipmentApi> getAllProcessedAndNotDelivered() {
        return this.shipmentRepository.findAllProcessedAndNotDelivered();
    }

    @Override
    public List<ShipmentApi> getShipmentsByRecipient(Recipient recipient) {
        return this.shipmentRepository.findShipmentsByRecipient(recipient);
    }

    @Override
    public List<ShipmentApi> getAllDelivered() {
        return this.shipmentRepository.findAllDelivered();
    }

    @Override
    public List<ShipmentApi> getShipmentsByCity(String city) {
        return this.shipmentRepository.findAllByCity(city);
    }

    @Override
    public List<ShipmentApi> getShipmentsByWeightGreaterThanEqual(Double weight) {
        return this.shipmentRepository.findAllByWeightGreaterThanEqual(weight);
    }

    @Override
    public List<ShipmentApi> getAllToOffice() {
        return this.shipmentRepository.findAllToOffice();
    }

    @Override
    public List<ShipmentApi> getAllByToOfficeIsFalse() {
        return this.shipmentRepository.findAllByToOfficeIsFalse();
    }

    @Override
    public List<ShipmentApi> getAllByToAddressIsFalse() {
        return this.shipmentRepository.findAllByToAddressIsFalse();
    }

    @Override
    public List<ShipmentApi> getShipmentsByCityAndToAddress(String city, boolean toAddress) {
        return this.shipmentRepository.findAllByCityAndToAddress(city, toAddress);
    }
}
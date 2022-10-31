package com.semestrialproject_logistic_company.services;

import com.semestrialproject_logistic_company.data.entity.OfficeEmployee;
import com.semestrialproject_logistic_company.data.entity.Recipient;
import com.semestrialproject_logistic_company.data.entity.Sender;
import com.semestrialproject_logistic_company.data.entity.Shipment;
import com.semestrialproject_logistic_company.data.projections.ShipmentApi;

import java.util.List;

public interface ShipmentService {

    Shipment saveShipment(Shipment shipment);

    ShipmentApi getShipment(Long id);

    List<ShipmentApi> getShipments();

    List<ShipmentApi> getShipmentsByRegistrant(OfficeEmployee registrant);

    void deleteShipment(Long id);

    List<ShipmentApi> getShipmentsBySender(Sender sender);

    List<ShipmentApi> getAllProcessedAndNotDelivered();

    List<ShipmentApi> getShipmentsByRecipient(Recipient recipient);

    List<ShipmentApi> getAllDelivered();

    List<ShipmentApi> getShipmentsByCity(String city);

    List<ShipmentApi> getShipmentsByWeightGreaterThanEqual(Double weight);

    List<ShipmentApi> getAllToOffice();

    List<ShipmentApi> getAllByToOfficeIsFalse();

    List<ShipmentApi> getAllByToAddressIsFalse();

    List<ShipmentApi> getShipmentsByCityAndToAddress(String city, boolean toAddress);
}

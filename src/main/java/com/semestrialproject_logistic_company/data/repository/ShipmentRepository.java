package com.semestrialproject_logistic_company.data.repository;

import com.semestrialproject_logistic_company.data.entity.OfficeEmployee;
import com.semestrialproject_logistic_company.data.entity.Recipient;
import com.semestrialproject_logistic_company.data.entity.Sender;
import com.semestrialproject_logistic_company.data.entity.Shipment;
import com.semestrialproject_logistic_company.data.projections.ShipmentApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

    ShipmentApi findShipmentsByShipmentId(Long id);

    List<ShipmentApi> findShipmentsByRegistrant(OfficeEmployee registrant);

    List<ShipmentApi> findAllBy();

    List<ShipmentApi> findShipmentsBySender(Sender sender);

    @Query("SELECT s FROM Shipment s WHERE s.isProcessed = true AND s.isDelivered = false")
    List<ShipmentApi> findAllProcessedAndNotDelivered();

    List<ShipmentApi> findShipmentsByRecipient(Recipient recipient);

    @Query("SELECT s FROM Shipment s WHERE s.isDelivered = true")
    List<ShipmentApi> findAllDelivered();

    List<ShipmentApi> findAllByCity(String city);

    List<ShipmentApi> findAllByWeightGreaterThanEqual(Double weight);

    @Query("SELECT s FROM Shipment s WHERE s.toOffice= true")
    List<ShipmentApi> findAllToOffice();

    List<ShipmentApi> findAllByToOfficeIsFalse();

    List<ShipmentApi> findAllByToAddressIsFalse();

    List<ShipmentApi> findAllByCityAndToAddress(String city, boolean toAddress);
}
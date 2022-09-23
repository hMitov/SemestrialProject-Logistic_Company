package com.semestrialproject_logistic_company.data.repository;

import com.semestrialproject_logistic_company.data.entity.OfficeEmployee;
import com.semestrialproject_logistic_company.data.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

    Shipment findByShipmentId(Long id);

    List<Shipment> findShipmentsByRegistrant(OfficeEmployee registrant);

}

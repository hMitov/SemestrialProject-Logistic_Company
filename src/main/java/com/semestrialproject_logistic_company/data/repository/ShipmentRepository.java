package com.semestrialproject_logistic_company.data.repository;

import com.semestrialproject_logistic_company.data.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShipmentRepository extends JpaRepository<Shipment, Long > {

    Shipment findByShipmentId( Long id );

}

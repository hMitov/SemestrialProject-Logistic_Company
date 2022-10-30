package com.semestrialproject_logistic_company.data.repository;

import com.semestrialproject_logistic_company.data.entity.Sender;
import com.semestrialproject_logistic_company.data.entity.Shipment;
import com.semestrialproject_logistic_company.data.projections.SenderApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ClientRepository extends JpaRepository<Sender, String> {

    //    SenderApi findClientByTelephone(String telephone);
//
    List<SenderApi> findAllBy();

    @Query("Select s from Sender s join fetch s.sendShipments where s.telephone = (:id)")
    List<Shipment> getShipmentsBySenderId(@PathVariable String id);

}

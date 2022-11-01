package com.semestrialproject_logistic_company.data.repository;

import com.semestrialproject_logistic_company.data.entity.Sender;
import com.semestrialproject_logistic_company.data.projections.SenderApi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Sender, String> {

    //    SenderApi findClientByTelephone(String telephone);
    List<SenderApi> findAllBy();

}

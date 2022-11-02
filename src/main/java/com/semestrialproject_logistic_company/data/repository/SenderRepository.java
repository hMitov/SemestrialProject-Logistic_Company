package com.semestrialproject_logistic_company.data.repository;

import com.semestrialproject_logistic_company.data.entity.Sender;
import com.semestrialproject_logistic_company.data.projections.SenderApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SenderRepository extends JpaRepository<Sender, Long> {

    SenderApi findSenderById(Long id);

    List<SenderApi> findSendersByFirstName(String firstName);

    List<SenderApi> findSendersByLastName(String lastName);

    List<SenderApi> findSendersByCity(String city);

    List<SenderApi> findSendersByAddress(String address);

    List<SenderApi> findSendersByTelephone(String telephone);

    List<SenderApi> findSendersByEmail(String email);
}

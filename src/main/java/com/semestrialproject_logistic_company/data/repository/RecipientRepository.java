package com.semestrialproject_logistic_company.data.repository;

import com.semestrialproject_logistic_company.data.entity.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipientRepository extends JpaRepository<Recipient, Long> {

}

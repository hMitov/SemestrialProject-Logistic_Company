package com.semestrialproject_logistic_company.data.repository;

import com.semestrialproject_logistic_company.data.entity.Supplier;
import com.semestrialproject_logistic_company.data.projections.SupplierApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    SupplierApi findSupplierById(Long id);

    List<SupplierApi> findSuppliersByFirstName(String firstName);

    List<SupplierApi> findSuppliersByLastName(String lastName);

    List<SupplierApi> findAllBySalaryGreaterThanEqual(double salary);
}

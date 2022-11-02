package com.semestrialproject_logistic_company.data.repository;

import com.semestrialproject_logistic_company.data.entity.OfficeEmployee;
import com.semestrialproject_logistic_company.data.projections.OfficeEmployeeApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfficeEmployeeRepository extends JpaRepository<OfficeEmployee, Long> {

    OfficeEmployeeApi findOfficeEmployeeById(Long id);

    List<OfficeEmployeeApi> findOfficeEmployeesByFirstName(String firstName);

    List<OfficeEmployeeApi> findOfficeEmployeesByLastName(String lastName);

    List<OfficeEmployeeApi> findAllBySalaryGreaterThanEqual(double salary);
}

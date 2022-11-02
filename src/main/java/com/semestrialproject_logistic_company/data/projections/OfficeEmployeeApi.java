package com.semestrialproject_logistic_company.data.projections;

import java.util.Date;

public interface OfficeEmployeeApi {
    Long getId();

    String getFirstName();

    String getLastName();

    double getSalary();

    Date getDateOfEmploy();


}

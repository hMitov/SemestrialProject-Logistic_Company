package com.semestrialproject_logistic_company.data.entity;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class OfficeEmployeeTest {
    @Test
    public void generateEmptyOfficeEmployee() {
        BaseEmployee officeEmployee = new OfficeEmployee();
        assertNotNull(officeEmployee);
    }

    @Test
    public void generateOfficeEmployee() {
        Long egn = 1234567890L;
        String firstName = "Joro";
        String middleName = "Jorev";
        String lastName = "Asparuhov";
        double salary = 2500.00;
        Date dateOfEmployee = new Date();

        BaseEmployee officeEmployee = new OfficeEmployee();
        officeEmployee.setEgn(egn);
        officeEmployee.setFirstName(firstName);
        officeEmployee.setMiddleName(middleName);
        officeEmployee.setLastName(lastName);
        officeEmployee.setSalary(salary);
        officeEmployee.setDateOfEmploy(dateOfEmployee);

        assertNotNull(officeEmployee);
        assertEquals("Joro", officeEmployee.getFirstName());
    }



}
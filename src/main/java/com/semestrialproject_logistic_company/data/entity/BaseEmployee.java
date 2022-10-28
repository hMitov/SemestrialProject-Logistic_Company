package com.semestrialproject_logistic_company.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class BaseEmployee implements Comparable<BaseEmployee> {

    @Id
    @Column(name = "egn")
    private Long egn;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "salary")
    private double salary;

    @Column(name = "date_of_employ")
    private Date dateOfEmploy;

    public BaseEmployee(Long egn, String firstName, String middleName, String lastName) {
        this.egn = egn;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = middleName;
    }

    public BaseEmployee(Long egn, String firstName, String middleName, String lastName, double salary, Date dateOfEmploy) {
        this.egn = egn;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.dateOfEmploy = dateOfEmploy;
    }

    @Override
    public int compareTo(BaseEmployee baseEmployee) {
        return this.egn.compareTo(baseEmployee.getEgn());
    }

}

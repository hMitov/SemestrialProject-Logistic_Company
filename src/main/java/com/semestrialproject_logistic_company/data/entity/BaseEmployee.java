package com.semestrialproject_logistic_company.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEmployee implements Comparable<BaseEmployee> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "egn")
    private String egn;

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

    @Override
    public int compareTo(BaseEmployee baseEmployee) {
        return this.egn.compareTo(baseEmployee.getEgn());
    }
}
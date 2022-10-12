package com.semestrialproject_logistic_company.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User extends BaseClient {

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "telephone")
    private String telephone;

    public User(String firstName, String lastName, String address, Long id, String telephone, String username,
                String email, String password) {
        super(firstName, lastName, address);
        this.email = email;
        this.password = password;
        this.telephone = telephone;
    }
}

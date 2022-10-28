package com.semestrialproject_logistic_company.data.repository;

import com.semestrialproject_logistic_company.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByEmail(String email);

    User getUserById(Long id);

    User getUserByEmail(String email);

}

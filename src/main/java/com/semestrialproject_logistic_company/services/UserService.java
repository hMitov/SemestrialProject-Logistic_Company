package com.semestrialproject_logistic_company.services;

import com.semestrialproject_logistic_company.data.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    User updateUser(User user);
}

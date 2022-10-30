package com.semestrialproject_logistic_company.services.implementations;

import com.semestrialproject_logistic_company.data.entity.User;
import com.semestrialproject_logistic_company.data.repository.UserRepository;
import com.semestrialproject_logistic_company.services.UserService;
import com.semestrialproject_logistic_company.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserUtils userUtils;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public User updateUser(User user) {
        User loadedUser = this.userUtils.checkIfObjectExists(user);
        return userRepository.save(loadedUser);
    }
}

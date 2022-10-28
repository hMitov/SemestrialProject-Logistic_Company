package com.semestrialproject_logistic_company.utils;

import com.semestrialproject_logistic_company.data.entity.User;
import com.semestrialproject_logistic_company.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserUtils {
    @Autowired
    UserRepository userRepository;

    public User checkIfObjectExists(User user) {
        User loadedUser = this.userRepository.getUserByEmail(user.getEmail());
        if(loadedUser != null) {
            loadedUser.setFirstName(user.getFirstName());
            loadedUser.setLastName(user.getLastName());
            loadedUser.setCity(user.getCity());
            loadedUser.setAddress(user.getAddress());
            loadedUser.setEmail(user.getEmail());
            loadedUser.setPassword(user.getPassword());
            loadedUser.setTelephone(user.getTelephone());
        } else {
            loadedUser = new User();

            loadedUser.setFirstName(user.getFirstName());
            loadedUser.setLastName(user.getLastName());
            loadedUser.setCity(user.getCity());
            loadedUser.setAddress(user.getAddress());
            loadedUser.setEmail(user.getEmail());
            loadedUser.setPassword(user.getPassword());
            loadedUser.setTelephone(user.getTelephone());
        }
        return loadedUser;
    }

}

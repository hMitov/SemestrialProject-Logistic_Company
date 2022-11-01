package com.semestrialproject_logistic_company.utils;

import com.semestrialproject_logistic_company.data.entity.BaseClient;
import com.semestrialproject_logistic_company.data.entity.Recipient;
import com.semestrialproject_logistic_company.data.entity.User;
import com.semestrialproject_logistic_company.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserUtils {
    @Autowired
    UserRepository userRepository;

    public User checkIfUserExists(User user) {
        User loadedUser = this.userRepository.getUserByEmail(user.getEmail());
        if (loadedUser == null) {
            loadedUser = new User();
        }
        loadedUser.setFirstName(user.getFirstName());
        loadedUser.setLastName(user.getLastName());
        loadedUser.setCity(user.getCity());
        loadedUser.setAddress(user.getAddress());
        loadedUser.setEmail(user.getEmail());
        loadedUser.setPassword(user.getPassword());
        loadedUser.setTelephone(user.getTelephone());

        return loadedUser;
    }

    public BaseClient castUserToClient(Long id) throws Exception {
        Optional<User> user = Optional.of(this.userRepository.findById(id)).orElseThrow(() -> new Exception("User not found"));

        BaseClient client = new Recipient();
        client.setFirstName(user.get().getFirstName());
        client.setLastName(user.get().getLastName());
        client.setCity(user.get().getCity());
        client.setAddress(user.get().getAddress());

        return client;
    }

}

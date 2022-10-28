package com.semestrialproject_logistic_company.services.implementations;

import com.semestrialproject_logistic_company.data.entity.User;
import com.semestrialproject_logistic_company.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    UserService userService;

    @Test
    public void saveNewUser() {
        User user = new User();
        user.setFirstName("Bojana");
        user.setLastName("Ivanov");
        user.setAddress("ul. Kleopatra 5");
        user.setCity("Sofia");
        user.setEmail("kalata@abv.bg");
        user.setTelephone("+35987654321");
        user.setPassword("66");

        userService.updateUser(user);
        assertEquals(userService.getUserById(7L), user);
    }


}
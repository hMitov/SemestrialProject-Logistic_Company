package com.semestrialproject_logistic_company.controllers;
import com.semestrialproject_logistic_company.data.entity.User;
import com.semestrialproject_logistic_company.services.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api")
@Api(tags = {"user"}, value = "User", produces = APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "/all-users", method = RequestMethod.GET)
    @ApiOperation(value = "Gets all users", nickname = "getAllUsers")
    @ApiResponse(message = "Users", code = 200, response = User.class)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(path = "/user{id}", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the user with specific id", nickname = "getUser")
    @ApiResponse(message = "Users", code = 200, response = User.class)
    public User getUserById(Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    @ApiOperation(value = "Updates the user with specific id", nickname = "updateUser")
    @ApiResponse(message = "Users", code = 200, response = User.class)
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }



}

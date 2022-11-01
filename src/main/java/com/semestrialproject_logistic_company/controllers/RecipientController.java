package com.semestrialproject_logistic_company.controllers;

import com.semestrialproject_logistic_company.services.RecipientService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api")
@Api(tags = {"recipient"}, value = "Recipient", produces = APPLICATION_JSON_VALUE)
public class RecipientController {

    @Autowired
    RecipientService recipientService;

}

package com.semestrialproject_logistic_company.controllers;

import com.semestrialproject_logistic_company.services.RecipientService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/recipients")
@Api(tags = {"recipient"}, value = "Recipient", produces = APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class RecipientController {
    private final RecipientService recipientService;
}

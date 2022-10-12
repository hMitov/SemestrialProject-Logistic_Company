package com.semestrialproject_logistic_company.controllers;

import com.semestrialproject_logistic_company.data.projections.ClientApi;
import com.semestrialproject_logistic_company.data.projections.SenderApi;
import com.semestrialproject_logistic_company.services.ClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/api")
@Api(value = "ClientControllerAPI", produces = APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ClientController {

//    @Autowired
//    ClientService clientService;
//
//    @RequestMapping(path = "/sender/{telephone}", method = RequestMethod.GET)
//    @ApiOperation(value = "Gets the client with specific id")
//    public SenderApi getSender(@PathVariable String telephone) {
//        return clientService.getClient(telephone);
//    }
//
//    @GetMapping(value = "/senders")
//    public List<ClientApi> getSender() {
//        return clientService.getClients();
//    }
}

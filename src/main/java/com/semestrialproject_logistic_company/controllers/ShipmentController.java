package com.semestrialproject_logistic_company.controllers;

import com.semestrialproject_logistic_company.data.projections.ShipmentApi;
import com.semestrialproject_logistic_company.services.ShipmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/api")
@Api(value = "ShipmentControllerAPI", produces = APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ShipmentController {

    @Autowired
    ShipmentService shipmentService;

    @RequestMapping(path = "/shipments/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the shipment with specific id")
    public ShipmentApi getShipment(@PathVariable Long id) {
        return shipmentService.getShipment(id);
    }

    @GetMapping(value = "/shipments")
    public List<ShipmentApi> getShipments() {
        return shipmentService.getShipments();
    }

}

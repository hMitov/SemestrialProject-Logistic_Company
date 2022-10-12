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

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api")
@Api(tags = {"shipment"}, value = "Shipment", produces = APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ShipmentController {

    @Autowired
    ShipmentService shipmentService;

    @RequestMapping(path = "/shipments/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the shipment with specific id", nickname = "getShipment")
    @ApiResponse(message = "Shipments", code = 200, response = ShipmentApi.class)
    public ShipmentApi getShipment(@PathVariable Long id) {
        return shipmentService.getShipment(id);
    }

    @GetMapping(value = "/shipments")
    @ApiOperation(value = "Gets all shipments", nickname = "getAllShipments")
    @ApiResponse(message = "Shipments", code = 200, response = ShipmentApi.class, responseContainer = "List")
    public List<ShipmentApi> getAllShipments() {
        return shipmentService.getShipments();
    }

}

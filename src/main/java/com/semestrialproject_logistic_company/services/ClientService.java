package com.semestrialproject_logistic_company.services;

import com.semestrialproject_logistic_company.data.entity.Sender;
import com.semestrialproject_logistic_company.data.entity.Shipment;

import java.util.List;

public interface ClientService {

    Sender saveClient(Sender client);

//    ClientApi getClient(String telephone);

//    List<ClientApi> getClients();

    List<Shipment> getShipmentsBySenderId(String telephone);

}

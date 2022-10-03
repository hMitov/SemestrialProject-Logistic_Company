package com.semestrialproject_logistic_company.data.projections;

public interface ShipmentApi {
    Long getShipmentId();

    String getName();

    ClientApi getSender();
}

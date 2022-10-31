package com.semestrialproject_logistic_company.data.projections;

public interface ShipmentApi {

    Long getShipmentId();

    SenderApi getSender();

    RecipientApi getRecipient();

    String getCity();

    boolean getIsDelivered();
}

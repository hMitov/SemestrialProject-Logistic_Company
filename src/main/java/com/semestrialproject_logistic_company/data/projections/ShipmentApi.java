package com.semestrialproject_logistic_company.data.projections;

import java.time.LocalDateTime;

public interface ShipmentApi {

    Long getId();

    SenderApi getSender();

    RecipientApi getRecipient();

    String getAddress();

    LocalDateTime getDeliveredDateTime();

    boolean getIsDelivered();

    Double getWeight();
}

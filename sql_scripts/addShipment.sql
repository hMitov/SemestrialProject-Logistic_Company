INSERT INTO Shipment (shipment_id, city, toOffice, toAddress, isProcessed, isDelivered, weight, sender_telephone,
                      recipient_telephone, registered_by_employee)
VALUES (1, 'Sofia', false, true, false, false, 150, '+359876245432', '+359874445231', null);


INSERT INTO Shipment (shipment_id, city, toOffice, toAddress, isProcessed, isDelivered, weight, sender_telephone,
                      recipient_telephone, registered_by_employee)
VALUES (2, 'Plovdiv', true, false, true, false, 5, '+359875098998', '+359875098765', null);


INSERT INTO Shipment (shipment_id, city, toOffice, toAddress, isProcessed, isDelivered, weight, sender_telephone,
                      recipient_telephone, registered_by_employee)
VALUES (3, 'Sofia', false, true, true, true, 10, '+359874445422', '+359874445231', null);


select *
from Shipment;
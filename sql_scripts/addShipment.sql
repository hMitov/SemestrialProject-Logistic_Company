INSERT INTO Shipment (shipment_id, name, sender_id, receiver_id, status, registered_by_employee)
VALUES (1, 'Socks', '+359876245432', '+359874445422', true, '9643234567');

INSERT INTO Shipment (shipment_id, name, sender_id, receiver_id, status, registered_by_employee)
VALUES (2, 'Trousers', '+359764216540', '+359875098998', false, '8956433568');

select * from Shipment;
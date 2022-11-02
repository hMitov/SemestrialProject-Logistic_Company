INSERT INTO Shipment (city, address, to_office, to_address, is_processed, is_delivered, weight, shipment_height,
                      shipment_width, sender, recipient, registered_by_employee, delivered_date_time)
VALUES ('Sofia', 'st. Kozyak 6, Sofia', false, true, false, false, 150, 1, 2, 1, 2, null, '2022-03-05 15:07:45');

INSERT INTO Shipment (city, address, to_office, to_address, is_processed, is_delivered, weight, shipment_height,
                      shipment_width, sender, recipient, registered_by_employee, delivered_date_time)
VALUES ('Plovdiv', 'st. Borovo 15, Plovdiv', true, false, true, false, 5, 3, 4, 1, 3, null, '2021-10-09 16:10:33');

INSERT INTO Shipment (city, address, to_office, to_address, is_processed, is_delivered, weight, shipment_height,
                      shipment_width, sender, recipient, registered_by_employee, delivered_date_time)
VALUES ('Sofia', 'Yastrebec 8, Sofia', false, true, true, true, 10, 1, 2, 2, 1, null, '2022-01-09 11:50:05');


select * from Shipment;
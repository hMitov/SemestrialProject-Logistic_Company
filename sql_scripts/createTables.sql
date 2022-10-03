create table Carrier
(
    egn                    BIGINT PRIMARY KEY NOT NULL,
    firstName              VARCHAR(30)        NOT NULL,
    middleName             VARCHAR(30)        NOT NULL,
    lastName               VARCHAR(30)        NOT NULL,
    salary                 DOUBLE             NOT NULL,
    dateOfEmploy           DATE               NOT NULL,
    deliveryNumber         INTEGER,
    vehicleRegPlate        VARCHAR(15),
    drivingLicenseCategory VARCHAR(15)
);
drop table Carrier;



create table Client
(
    telephone  VARCHAR(30) PRIMARY KEY NOT NULL,
    first_name VARCHAR(30)             NOT NULL,
    last_name  VARCHAR(30)             NOT NULL
);
drop table Client;



create table Shipment
(
    shipment_id            INT PRIMARY KEY,
    name                   VARCHAR(30) NOT NULL,
    sender_id              VARCHAR(30) NOT NULL,
    receiver_id            VARCHAR(30) NOT NULL,
    status                 BOOLEAN,
    registered_by_employee VARCHAR(30) NOT NULL,
    FOREIGN KEY Shipment (receiver_id) references Client (telephone),
    FOREIGN KEY Shipment (receiver_id) references Client (telephone)
);
drop table Shipment;




create table office_employee
(
    egn            VARCHAR(30) PRIMARY KEY NOT NULL,
    first_name     VARCHAR(30)             NOT NULL,
    middle_name    VARCHAR(30)             NOT NULL,
    last_name      VARCHAR(30)             NOT NULL,
    salary         DOUBLE(10, 2)           NOT NULL,
    date_of_employ DATE
);
drop table office_employee;


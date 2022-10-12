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



create table Sender
(
    telephone  VARCHAR(30) PRIMARY KEY NOT NULL,
    first_name VARCHAR(30)             NOT NULL,
    last_name  VARCHAR(30)             NOT NULL,
    city       VARCHAR(30),
    address    VARCHAR(30),
    email      VARCHAR(30)
);
drop table Sender;




create table Recipient
(
    telephone  VARCHAR(30) PRIMARY KEY NOT NULL,
    first_name VARCHAR(30)             NOT NULL,
    last_name  VARCHAR(30)             NOT NULL,
    city       VARCHAR(30),
    address    VARCHAR(30)             NOT NULL,
    email      VARCHAR(30)             NOT NULL
);
drop table Recipient;




create table Shipment
(
    shipment_id            INT PRIMARY KEY,
    city                   VARCHAR(30) NOT NULL,
    toOffice               BOOLEAN     NOT NULL,
    toAddress              BOOLEAN     NOT NULL,
    isProcessed            BOOLEAN     NOT NULL,
    isDelivered            BOOLEAN     NOT NULL,
    weight                 DOUBLE      NOT NULL,
    sender_telephone       VARCHAR(30) NOT NULL,
    recipient_telephone    VARCHAR(30) NOT NULL,
    registered_by_employee VARCHAR(30),
    FOREIGN KEY (sender_telephone) references Sender (telephone),
    FOREIGN KEY (recipient_telephone) references Recipient (telephone)
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


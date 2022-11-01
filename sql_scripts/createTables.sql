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
    id         INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    telephone  VARCHAR(30) NOT NULL,
    first_name VARCHAR(30) NOT NULL,
    last_name  VARCHAR(30) NOT NULL,
    city       VARCHAR(30),
    address    VARCHAR(30),
    email      VARCHAR(30)
);
drop table Sender;



create table Recipient
(
    id         INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    telephone  VARCHAR(30) NOT NULL,
    first_name VARCHAR(30) NOT NULL,
    last_name  VARCHAR(30) NOT NULL,
    city       VARCHAR(30),
    address    VARCHAR(30) NOT NULL,
    email      VARCHAR(30) NOT NULL
);
drop table Recipient;



create table Shipment
(
    id                     INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    city                   VARCHAR(30) NOT NULL,
    address                VARCHAR(30) NOT NULL,
    to_office              BOOLEAN     NOT NULL,
    to_address             BOOLEAN     NOT NULL,
    is_processed           BOOLEAN     NOT NULL,
    is_delivered           BOOLEAN     NOT NULL,
    weight                 DOUBLE      NOT NULL,
    sender                 INT         NOT NULL,
    recipient              INT         NOT NULL,
    registered_by_employee VARCHAR(30),
    delivered_date_time    DATETIME,
    FOREIGN KEY (sender) references Sender (id),
    FOREIGN KEY (recipient) references Recipient (id)
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



create table User
(
    id         INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(30) NOT NULL,
    last_name  VARCHAR(30) NOT NULL,
    email      VARCHAR(30) NOT NULL,
    password   VARCHAR(30) NOT NULL,
    telephone  VARCHAR(30) NOT NULL,
    address    VARCHAR(30) NOT NULL,
    city       VARCHAR(30) NOT NULL
);
drop table User;
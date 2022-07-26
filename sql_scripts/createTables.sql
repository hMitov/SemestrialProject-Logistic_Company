create table Supplier
(
    id                         INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    egn                        VARCHAR(30) NOT NULL,
    first_name                 VARCHAR(30) NOT NULL,
    middle_name                VARCHAR(30) NOT NULL,
    last_name                  VARCHAR(30) NOT NULL,
    salary                     DOUBLE      NOT NULL,
    date_of_employ             DATE        NOT NULL,
    delivery_number            INTEGER,
    vehicle_registration_plate VARCHAR(15),
    driving_license_category   VARCHAR(15)
);
drop table Supplier;



create table Sender
(
    id         INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    telephone  VARCHAR(30) NOT NULL,
    first_name VARCHAR(30) NOT NULL,
    last_name  VARCHAR(30) NOT NULL,
    city       VARCHAR(30) NOT NULL,
    address    VARCHAR(30) NOT NULL,
    email      VARCHAR(30) NOT NULL
);
drop table Sender;



create table Recipient
(
    id         INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    telephone  VARCHAR(30) NOT NULL,
    first_name VARCHAR(30) NOT NULL,
    last_name  VARCHAR(30) NOT NULL,
    city       VARCHAR(30) NOT NULL,
    address    VARCHAR(30) NOT NULL,
    email      VARCHAR(30) NOT NULL
);
drop table Recipient;



create table Shipment
(
    id                     INT                                                                              NOT NULL
        AUTO_INCREMENT PRIMARY KEY,
    city                   VARCHAR(30)                                                                      NOT NULL,
    address                VARCHAR(30)                                                                      NOT NULL,
    to_office              BOOLEAN                                                                          NOT NULL,
    to_address             BOOLEAN                                                                          NOT NULL,
    is_processed           BOOLEAN                                                                          NOT NULL,
    is_delivered           BOOLEAN                                                                          NOT NULL,
    weight                 DOUBLE                                                                           NOT NULL,
    shipment_height        ENUM ('TO_1_METER', 'TO_2_METERS', 'TO_5_METERS', 'TO_7_METERS', 'TO_10_METERS') NOT NULL,
    shipment_width         ENUM ('TO_1_METER', 'TO_2_METERS', 'TO_3_METERS', 'TO_5_METERS', 'TO_10_METERS') NOT NULL,
    sender                 INT                                                                              NOT NULL,
    recipient              INT                                                                              NOT NULL,
    registered_by_employee VARCHAR(30),
    delivered_date_time    DATETIME,
    FOREIGN KEY (sender) references Sender (id),
    FOREIGN KEY (recipient) references Recipient (id)
);
drop table Shipment;



create table Office_Employee
(
    id             INT           NOT NULL AUTO_INCREMENT PRIMARY KEY,
    egn            VARCHAR(30)   NOT NULL,
    first_name     VARCHAR(30)   NOT NULL,
    middle_name    VARCHAR(30)   NOT NULL,
    last_name      VARCHAR(30)   NOT NULL,
    salary         DOUBLE(10, 2) NOT NULL,
    date_of_employ DATE
);
drop table Office_Employee;



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
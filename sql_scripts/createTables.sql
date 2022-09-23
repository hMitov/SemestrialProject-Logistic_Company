create table Carrier(
                        egn BIGINT PRIMARY KEY NOT NULL,
                        firstName VARCHAR(30) NOT NULL,
                        middleName VARCHAR(30) NOT NULL,
                        lastName VARCHAR(30) NOT NULL,
                        salary DOUBLE NOT NULL,
                        dateOfEmploy DATE NOT NULL,
                        deliveryNumber INTEGER,
                        vehicleRegPlate VARCHAR(15),
                        drivingLicenseCategory VARCHAR(15)
);

drop table Carrier;
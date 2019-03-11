CREATE DATABASE Car_Parking_Management_System;

ALTER LOGIN sa with password = '123456'
alter login sa enable

--Create Database ProjectDB;

Use  Car_Parking_Management_System;

CREATE TABLE Users(
	UserID int IDENTITY(1001,1) NOT NULL PRIMARY KEY,
	UserName varchar (50) NOT NULL,
	FirstName varchar (50) NOT NULL,
	LastName varchar (50) NOT NULL,
	Password varchar (50) Not Null,
	PhoneNumber varchar (50) NOT NULL,
	LicenceNumber varchar (50) NOT NULL,
	NIDNumber varchar (50) not null,
	Gender varchar (10) not null,
	UserType varchar (50) null,
    Images image not null 
);

select* from Users;
CREATE TABLE Owner(
    OwnerId int IDENTITY(2001,1) NOT NULL PRIMARY KEY,
    UserName varchar (50) NOT NULL,
	FirstName varchar (50) NOT NULL,
	LastName varchar (50) NOT NULL,
	Password varchar (50) Not Null,
	PhoneNumber varchar (50) NOT NULL,
	NIDNumber varchar (50) not null,
	Gender varchar (10) not null,
	ParkingSlots int NOT NULL,
	Images image not null 
);

SELECT * FROM Owner;
--DROP TABLE Owner;

CREATE TABLE OwnersAddress(
OwnerId int NOT NULL FOREIGN KEY REFERENCES  Owner(OwnerId),
AddressId int IDENTITY(3001,1) PRIMARY KEY NOT NULL ,
Area VARCHAR(50) NOT NULL,
Sector VARCHAR(10) NOT NULL,
RodeNumber VARCHAR(10) NOT NULL,
HouseNumber VARCHAR(10) NOT NULL
); 

--INSERT INTO OwnersAddress VALUES (2001,'A','1','2','3');

SELECT * FROM OwnersAddress;
--DROP TABLE OwnersAddress;

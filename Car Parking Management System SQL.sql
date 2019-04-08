CREATE DATABASE Car_Parking_Management_System;

ALTER LOGIN sa with password = '123456'
alter login sa enable

--Create Database ProjectDB;

Use  Car_Parking_Management_System;

CREATE TABLE Users(
	UserID int IDENTITY(1001,1) NOT NULL ,
	UserName varchar (50) NOT NULL,
	FirstName varchar (50) NOT NULL,
	LastName varchar (50) NOT NULL,
	Password varchar (50) Not Null,
	PhoneNumber varchar (50) NOT NULL,
	LicenceNumber varchar (50) NOT NULL,
	NIDNumber varchar (50) not null,
	Gender varchar (10) not null,
	UserType varchar (50) not null,
    Images image not null,
	PRIMARY KEY(UserID,UserType) 
);

ALTER TABLE Users ADD UNIQUE(PhoneNumber);

--DROP TABLE Users;
--ALTER TABLE Users 
  -- ADD CONSTRAINT PK_CUSTID PRIMARY KEY (UserID, UserType);

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
	Price int not null,
	Images image not null 
	
);
ALTER TABLE Owner ADD UNIQUE(PhoneNumber);
--SELECT * FROM Owner;
--DROP TABLE Owner;

CREATE TABLE OwnersAddress(
OwnerId int NOT NULL FOREIGN KEY REFERENCES  Owner(OwnerId),
AddressId int IDENTITY(3001,1) PRIMARY KEY NOT NULL ,
Area VARCHAR(50) NOT NULL,
Sector VARCHAR(50) NOT NULL,
RodeNumber VARCHAR(50) NOT NULL,
HouseNumber VARCHAR(50) NOT NULL
); 

--INSERT INTO OwnersAddress VALUES (2002,'Niketan','NiketanBazar','32b','339bc');
--INSERT INTO OwnersAddress VALUES (2002,'Niketan','Niketan Bazar','32b','339bc');
--SELECT * FROM OwnersAddress;
--DROP TABLE OwnersAddress;

Select * from Owner full join OwnersAddress on Owner.OwnerId = OwnersAddress.OwnerId where Owner.UserName = 'zahid';


--select Owner.PhoneNumber,Owner.FirstName,Owner.Price,OwnersAddress.Area,OwnersAddress.Sector,OwnersAddress.RodeNumber,OwnersAddress.HouseNumber from Owner full join OwnersAddress on Owner.OwnerId = OwnersAddress.OwnerId;

select Owner.PhoneNumber,Owner.FirstName,Owner.Price,OwnersAddress.Area,OwnersAddress.Sector,OwnersAddress.RodeNumber,OwnersAddress.HouseNumber from 
Owner full join OwnersAddress 
on Owner.OwnerId = OwnersAddress.OwnerId
where OwnersAddress.Area = 'Modhubagh' and Owner.OwnerId  in (select OwnerId from  ParkingSlot where Reserved = 0);


SELECT OwnersAddress.OwnerId,AddressId,Area,Sector,RodeNumber,HouseNumber FROM OwnersAddress LEFT JOIN Owner ON OwnersAddress.OwnerId = Owner.OwnerId;


SELECT OwnersAddress.OwnerId,Owner.OwnerId FROM OwnersAddress LEFT JOIN Owner ON OwnersAddress.OwnerId = Owner.OwnerId;



CREATE TABLE  ParkingSlot(
OwnerId int NOT NULL FOREIGN KEY REFERENCES  Owner(OwnerId),
SloatId int IDENTITY(4001,1) PRIMARY KEY NOT NULL,
PhoneNmber varchar(11) not null,
StartingTime varchar(50) null,
Duration varchar(10) null,
Reserved int not null,
Price decimal  null
); 


ALTER TABLE ParkingSlot
ADD  EndingTime varchar(50) null;

ALTER TABLE ParkingSlot
ADD  TotalBill decimal null;

sp_rename 'ParkingSlot.EndingTimes', 'EndingTime', 'COLUMN';
sp_rename 'ParkingSlot.Durations', 'Duration', 'COLUMN';

ALTER TABLE ParkingSlot ADD CONSTRAINT Reserved DEFAULT 0 FOR Reserved;

insert into ParkingSlot values (2001,'014897249','85873','3',' ',10);
insert into ParkingSlot values (2002,'014897249','','',' ',10);

update ParkingSlot set StartingTime = ' ',Duration = ' ',EndingTime = ' ',Reserved = 1, TotalBill = 0 where PhoneNmber = '01734089033';

SELECT Owner.FirstName,Owner.PhoneNumber,ParkingSlot.StartingTime,ParkingSlot.EndingTime,ParkingSlot.Duration,ParkingSlot.TotalBill 
Owner full JOIN ParkingSlot ON Owner.OwnerId = ParkingSlot.OwnerId;



--update ParkingSlot set Reserved = 0 where OwnerId = 2001;


--select * from ParkingSlot;
--DROP TABLE ParkingSlot;



CREATE TABLE Uses(
SlotId int IDENTITY(4001,1) NOT NULL PRIMARY KEY,
Users int NOT NULL FOREIGN KEY REFERENCES  Users(UserID),
OwnerId int NOT NULL FOREIGN KEY REFERENCES  Owner(OwnerId),
Time varchar(50) null,
Price decimal  null
);




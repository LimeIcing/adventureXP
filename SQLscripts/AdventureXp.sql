drop database if exists adventureXp;
create database adventureXp;
use adventureXp;

DROP USER IF EXISTS 'groot'@'localhost';
CREATE USER 'groot'@'localhost' IDENTIFIED BY 'iamgroot';
GRANT ALL ON * TO 'groot'@'localhost';

create table Activity (
activityId int primary key auto_increment,
name varchar(45),
duration int,
minAge int,
minHeight int,
price double
);

create table Equipment(
equipmentId int primary key auto_increment,
name varchar(45),
isAvailable boolean
);

CREATE TABLE Employee (
    employeeId INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(45),
    password VARCHAR(45)
);

create table Customer(
customerId int primary key auto_increment,
username varchar(45),
password varchar(45),
name varchar(45)
);

create table Booking(
bookingId int primary key auto_increment,
bookingDate date,
numOfParticipants int,
customerId int,
activityId int,
instructor varchar(45),
notes varchar(255),
foreign key (customerId) references Customer(customerId),
foreign key (activityId) references Activity(activityId)
);

-- Dummy Data to fill up the table
insert into Activity (name, duration, minAge, minHeight, price)
	value 	('Go-Kart',45, 13, 120, 200),
			('Mini Golf', 30, 5, 50, 60);

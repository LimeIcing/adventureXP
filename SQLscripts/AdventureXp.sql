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
minHeight double,
price int
);
create table Equipment(
equipmentId int primary key auto_increment,
name varchar(45),
isAvailable boolean
);
CREATE TABLE employee (
    employeeId INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(45),
    password VARCHAR(45)
);
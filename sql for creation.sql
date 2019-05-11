create database if not exists hsr_db;
use hsr_db;
drop table people;
create table People(
Id int primary key auto_increment,
CreateDate datetime not null,
Name varchar (30) not null,
Address varchar (50) not null,
Phone varchar (10) not null
);
drop table staff;
create table Staff(
Id int primary key auto_increment,
CreateDate datetime not null,
StaffId varchar (10) unique not null,
Password varchar (20) not null,
Roll varchar (20) not null,
foreign key fk_Roll(Roll) references Rolls(Roll),
foreign key fk_peopleId(Id) references People(Id)
);

create table Rolls(
id int primary key,
Roll varchar (20) not null unique
);
create table Customers(
Id int primary key,
FirstName varchar(30) not null,
MiddleName varchar(30),
LastName varchar(30) not null,
AddressLine varchar(30) not null,
City varchar (30) not null,
State varchar (30) not null,
ZipCode varchar(5) not null,
Phone varchar(10) not null
);

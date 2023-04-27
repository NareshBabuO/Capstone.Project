create database employee_management_system;
use employee_management_System;
create table Employee(Employee_Id integer  primary key not null, Employee_Name varchar(200),Date_Of_Birth date);
desc Employee;
insert into Employee values(16101,'Naresh','1998-08-31');
insert into Employee values(16102,'Mahesh','2000-06-14'),(16103,'Nandan','1999-02-17');




insert into Employee values
(16104,'Bharath','1998-11-18 '),(16105,'Mohan','2001-05-01'),(16106,'Sahil',' 1997-09-28'),
(16107,'Sujith',' 1997-12-18'),(16108,'Hritik','2000-01-23'),(16109,'Shreya','1999-01-13'),
(16110,'Santhosh','2002-11-29');



select * from Employee;










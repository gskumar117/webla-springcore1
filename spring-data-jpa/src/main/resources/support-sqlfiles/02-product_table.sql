#Drop Database

DROP DATABASE IF EXISTS WEBLA_SPRING;

#Create Database

CREATE DATABASE  IF NOT EXISTS `WEBLA_SPRING`;

USE `WEBLA_SPRING`;


DROP TABLE IF EXISTS `product`;


create table product(
id int PRIMARY KEY,
name varchar(20),
description varchar(100),
price decimal(8,3) 
);

show tables;

select * from product;


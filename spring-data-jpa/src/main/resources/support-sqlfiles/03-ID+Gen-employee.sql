USE `WEBLA_SPRING`;

drop table employee;

create table employee(
employee_id int primary key,
name varchar(20)
)


#Setting Up ID Generation

create table employee(
employee_id int PRIMARY KEY AUTO_INCREMENT,
name varchar(20)
)


#Setting up table Generation

create table id_gen(
gen_name varchar(60) PRIMARY KEY,
gen_val int(20)
)

drop table employee;

create table employee(
employee_id int,
name varchar(20)
)
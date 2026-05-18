create table typeofcustomer
(
    id   int auto_increment
        primary key,
    name varchar(255) not null
);


create table CustomerService
(
    id                 int auto_increment
        primary key,
    name               varchar(255) not null,
    email              varchar(255) not null,
    phone_number       varchar(255) not null,
    typeofcustomer_id  int,
    foreign key (typeofcustomer_id) references typeofcustomer (id)
);
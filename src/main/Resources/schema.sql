/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  hh
 * Created: Aug 12, 2019
 */


CREATE TABLE Product (

    ProductID varchar(20),

    Name varchar(50) not null,

    Description varchar(150),

    Category varchar(50) not null,

    Price decimal(7,2) not null,

    Quantity integer not null,

    constraint Product_PK primary key (ProductID)

);

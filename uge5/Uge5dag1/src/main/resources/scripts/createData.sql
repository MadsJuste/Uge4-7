/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Juste
 */

CREATE DATABASE IF NOT EXISTS `rest1`

USE `rest1`;

DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
  `ID` int(11) NOT NULL,
  `fName` varchar(45) NOT NULL,
  `lName` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

insert  into `person`(`ID`,`fName`,`lName`,`phone`) 
values 
('1','mads','justsen','21844113'),
('2','bob','bobson','1234564'),
('3','tim','timson','98765452');

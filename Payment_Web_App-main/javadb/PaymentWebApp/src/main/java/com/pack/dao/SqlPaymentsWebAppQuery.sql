CREATE DATABASE payments_web_app;

USE payments_web_app;

CREATE TABLE user_info(
Id INT  PRIMARY KEY AUTO_INCREMENT,
User_Name VARCHAR(50) UNIQUE NOT NULL,
First_Name VARCHAR(50) NOT NULL,
Last_Name VARCHAR(50) NOT NULL,
Email_Id VARCHAR(30) UNIQUE NOT NULL,
Phone_Number  VARCHAR(15) UNIQUE NOT NULL,
Date_Of_Birth VARCHAR(20) NOT NULL,
Address VARCHAR(150) NOT NULL,
Password VARCHAR(15) NOT NULL,
Wallet_Balance DOUBLE NOT NULL DEFAULT "0"
);

DESC user_info;

SELECT * FROM user_info;	
-- drop table user_info;

SELECT User_Name, Phone_Number, Password FROM user_info WHERE ((User_Name = "" || Phone_Number = "6303244920") && Password ="Pass");

-- CREATE TABLE Bank_Acct_Details(
-- Id INT PRIMARY KEY AUTO_INCREMENT,
-- Acct_Num VARCHAR(30) UNIQUE NOT NULL,
-- Acct_Holder_Name VARCHAR(50) NOT NULL,
-- Bank_Name VARCHAR(40) NOT NULL,
-- Acct_IFSC_Code VARCHAR(20) NOT NULL,
-- Acct_Type ENUM("SAVINGS","CURRENT","LOAN","SALARY"),
-- Acct_Pin VARCHAR(30) NOT NULL
-- );


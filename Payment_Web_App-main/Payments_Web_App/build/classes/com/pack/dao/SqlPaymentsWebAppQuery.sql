
CREATE DATABASE payments_web_app;

USE payments_web_app;

CREATE TABLE user_info(
Id INT UNIQUE NOT NULL AUTO_INCREMENT,
User_Name VARCHAR(50)  PRIMARY KEY,
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

CREATE TABLE Bank_Account_Type(
Id INT UNIQUE NOT NULL AUTO_INCREMENT,
Acct_Type_Code VARCHAR(3) PRIMARY KEY,
Acct_Type_Name VARCHAR(15)
);
INSERT INTO Bank_Account_Type(Id,Acct_Type_Code,Acct_Type_Name) 
VALUES (1,"SA","SAVINGS"),
(2,"CA","CURRENT"),
(3,"LA","LOAN"),
(4,"SL","SALARY");

DESC Bank_Account_Type;
SELECT * FROM Bank_Account_Type;


CREATE TABLE Bank_Acct_Details(
Id INT PRIMARY KEY AUTO_INCREMENT,
Acct_Num VARCHAR(30) UNIQUE NOT NULL,
Acct_Holder_Name VARCHAR(50) NOT NULL,
Bank_Name VARCHAR(40) NOT NULL,
Acct_IFSC_Code VARCHAR(20) NOT NULL,
Acct_Pin VARCHAR(30) NOT NULL,
Acct_Type VARCHAR(3) NOT NULL, 
FOREIGN KEY(Acct_Type) REFERENCES Bank_Account_Type(Acct_Type_Code)
ON UPDATE CASCADE
ON DELETE CASCADE,
User_Name  VARCHAR(50) NOT NULL, FOREIGN KEY(User_Name) REFERENCES user_info(User_Name),
BanK_Balance DOUBLE NOT NULL DEFAULT "0",
Phone_Num varchar(20) not null
);

select * from Bank_acct_details;

-- alter table bank_acct_details 
-- add column Phone_Num varchar(20) not null ;

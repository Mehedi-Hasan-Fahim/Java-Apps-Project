create database expense_tracker_db;
USE expense_tracker_db;

CREATE TABLE IF NOT EXISTS user_details (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name_ VARCHAR(30) NOT NULL,
    DOB DATE NOT NULL,
    email VARCHAR(30) NOT NULL,
    password_ VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS expenses (
    ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(30) NOT NULL,
    password_ VARCHAR(20) NOT NULL,
    Date_Issue DATE NOT NULL,
    Category VARCHAR(20) NOT NULL,
    Remarks VARCHAR(30) NOT NULL,
    Amount INT NOT NULL
);

CREATE TABLE IF NOT EXISTS category (
    category_list VARCHAR(20) NOT NULL,
    email VARCHAR(30) NOT NULL,
    password_ VARCHAR(20) NOT NULL,
    CONSTRAINT unique_category_per_user PRIMARY KEY (category_list, email)
);

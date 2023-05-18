CREATE DATABASE example_db;

USE example_db;

CREATE TABLE example_table (
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    body VARCHAR(30) NOT NULL,
    result INT(6) NOT NULL,
);

INSERT INTO example_table (body,result)
VALUES ('1+1', 2);
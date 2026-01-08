CREATE DATABASE three_tier_application_database;

USE three_tier_application_database;

CREATE TABLE name (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100)
);

INSERT INTO name(name) VALUES ('Default');
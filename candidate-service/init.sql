CREATE DATABASE IF NOT EXISTS candidateDB;
CREATE USER 'issam'@'%' IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON candidateDB.* TO 'issam'@'%';
FLUSH PRIVILEGES;


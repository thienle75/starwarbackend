CREATE DATABASE restapi;
USE restapi;
CREATE TABLE machete (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  ip CHAR(10) NOT NULL,
  movieid char(10) NOT NULL,
  order int(6)
);
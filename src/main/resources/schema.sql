DROP TABLE IF EXISTS users;

CREATE TABLE users(
  id INTEGER NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) DEFAULT NULL,
  email VARCHAR(45) DEFAULT NULL,
  password VARCHAR(80) DEFAULT NULL,
  PRIMARY KEY (id)
);
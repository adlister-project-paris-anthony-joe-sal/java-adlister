DROP DATABASE IF EXISTS adlister_db;
CREATE DATABASE  adlister_db;
USE adlister_db;



DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
   id INT UNSIGNED NOT NULL AUTO_INCREMENT,
   username VARCHAR(240) NOT NULL,
   first_name VARCHAR(60),
   last_name VARCHAR(60),
   email VARCHAR(240) NOT NULL,
   password VARCHAR(255) NOT NULL,
   zip_code INT NOT NULL,
   phone_number INT NOT NULL,
   is_logged_in BOOLEAN,
   PRIMARY KEY (id)
);

CREATE TABLE ads (
 id INT UNSIGNED NOT NULL AUTO_INCREMENT,
 user_id INT UNSIGNED NOT NULL,
 title VARCHAR(240) NOT NULL,
 description TEXT NOT NULL,
 date_created DATETIME,
 PRIMARY KEY (id),
 FOREIGN KEY (user_id) REFERENCES users(id)
     ON DELETE CASCADE
);


CREATE TABLE categories (
        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
        name VARCHAR(60),
        PRIMARY KEY(id)
);

CREATE TABLE ad_categories (
        ads_id INT UNSIGNED NOT NULL,
        categories_id INT UNSIGNED,
        FOREIGN KEY (ads_id) REFERENCES ads(id),
        FOREIGN KEY (categories_id) REFERENCES categories(id)
);

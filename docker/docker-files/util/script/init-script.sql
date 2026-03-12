CREATE DATABASE IF NOT EXISTS product_db;

USE product_db;

CREATE TABLE product(
id_producto INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(100),
descripcion VARCHAR(100),
precio DECIMAl(10,2)
);


INSERT INTO  product(nombre, descripcion, precio)
VALUES("puma", "zapatilla de marca", 220.55)
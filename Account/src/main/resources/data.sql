CREATE TABLE cliente(
    id INT AUTO_INCREMENT PRIMARY KEY, 
    nombre VARCHAR(255), 
    apellidos VARCHAR(450), 
    NIF VARCHAR(9) UNIQUE, 
    fecha_nacimiento DATE
);

CREATE TABLE cuenta(
    id VARCHAR(300) PRIMARY KEY, 
    banco VARCHAR(200), 
    nombre VARCHAR(255),
    id_pais INT, 
    fecha_alta DATE, 
    fecha_baja DATE, 
    activa BOOLEAN
);

CREATE TABLE pertenece(
    id INT PRIMARY KEY, 
    id_cliente INT, 
    id_cuenta VARCHAR(300), 
    FOREIGN KEY(id_cliente) REFERENCES cliente (id)
    ON DELETE CASCADE ON UPDATE CASCADE, 
    FOREIGN KEY(id_cuenta) REFERENCES cuenta (id)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE tipo(
    id INT PRIMARY KEY, 
    nombre VARCHAR (250), 
    descripcion text
);

CREATE TABLE movimiento(
    id INT AUTO_INCREMENT PRIMARY KEY, 
    id_cuenta VARCHAR(300),
    id_cuenta_origen VARCHAR(300), 
    id_cuenta_destino VARCHAR(300), 
    cantidad DOUBLE, 
    fecha DATE, 
    id_tipo INT,
    FOREIGN KEY(id_cuenta) REFERENCES cuenta (id)
    ON DELETE CASCADE ON UPDATE CASCADE, 
    FOREIGN KEY(id_tipo) REFERENCES tipo(id)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO cliente (nombre, apellidos, NIF, fecha_nacimiento) VALUES ('Palmira', 'Romia Segura', '12345678C', '1985-11-10'); 
INSERT INTO cliente (nombre, apellidos, NIF, fecha_nacimiento) VALUES ('Miguel Ángel', 'Sastre Gàlvez', '12345679T', '1993-02-18');
INSERT INTO cliente (nombre, apellidos, NIF, fecha_nacimiento) VALUES ('Encarnacion', 'Segura Valero', '47114798A', '1955-11-24');
INSERT INTO cliente (nombre, apellidos, NIF, fecha_nacimiento) VALUES ('Santiago', 'Romia Bosch', '14789785S', '1956-11-24');

INSERT INTO cuenta (id, banco, nombre, id_pais, fecha_alta, fecha_baja, activa) VALUES ('1450-1345-11-1985', 'CaixaBank', 'Cuenta Estrella', '12', '2010-11-10', null, true);
INSERT INTO cuenta (id, banco, nombre, id_pais, fecha_alta, fecha_baja, activa) VALUES ('2817-7847-06-7417', 'Santander', 'Cuenta Joven', '12', '2001-01-31', '2022-12-01', false);
INSERT INTO cuenta (id, banco, nombre, id_pais, fecha_alta, fecha_baja, activa) VALUES ('1774-4578-10-1234', 'ING', 'Cuenta Ahorro', '11', '2009-05-20', '2021-10-10', false);
INSERT INTO cuenta (id, banco, nombre, id_pais, fecha_alta, fecha_baja, activa) VALUES ('4789-8712-08-2478', 'RuralCaja', 'Cuenta Rural', '12', '2015-08-14', null, true);

INSERT INTO pertenece (id, id_cliente, id_cuenta) VALUES (101, 1, '1450-1345-11-1985');
INSERT INTO pertenece (id, id_cliente, id_cuenta) VALUES (102, 2, '2817-7847-06-7417');
INSERT INTO pertenece (id, id_cliente, id_cuenta) VALUES (103, 4, '4789-8712-08-2478');
INSERT INTO pertenece (id, id_cliente, id_cuenta) VALUES (104, 3, '1774-4578-10-1234');

INSERT INTO tipo (id, nombre, descripcion) VALUES (1, 'Ingreso a cuenta propia', 'Ingresar dinero en efectivo a cuenta propia');
INSERT INTO tipo (id, nombre, descripcion) VALUES (2, 'Sacar dinero', 'Sacar una cantidad de dinero de la cuenta en efectivo');
INSERT INTO tipo (id, nombre, descripcion) VALUES (3, 'Ingreso a cuenta ajena', 'Ingresar dinero en efectivo a cuenta ajena');
INSERT INTO tipo (id, nombre, descripcion) VALUES (4, 'Transferencia a cuenta ajena', 'Ingresar dinero de tu cuenta a una cuenta ajena');
INSERT INTO tipo (id, nombre, descripcion) VALUES (5, 'Transferencia a cuenta propia', 'Ingresar dinero de una cuenta propia a otra');

INSERT INTO movimiento (id_cuenta, id_cuenta_origen, id_cuenta_destino, cantidad, fecha, id_tipo) VALUES ('1450-1345-11-1985', null, '1450-1345-11-1985', 100, '2024-01-30', 1);

CREATE TABLE cliente(
    id INT PRIMARY KEY, 
    nombre VARCHAR(255), 
    apellidos VARCHAR(450), 
    NIF VARCHAR(9) UNIQUE, 
    fecha_nacimiento DATE
);

CREATE TABLE cuenta(
    id INT PRIMARY KEY, 
    banco VARCHAR(200), 
    nombre VARCHAR(255),
    id_pais INT, 
    fecha_alta DATE, 
    fecha_baja DATE, 
    activa BOOLEAN
);

CREATE TABLE cliente_cuenta(
    id INT PRIMARY KEY, 
    id_cliente INT, 
    id_cuenta INT, 
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
    id INT PRIMARY KEY, 
    id_cuenta INT,
    id_cuenta_origen INT, 
    id_cuenta_destino INT, 
    cantidad INT, 
    fecha DATE, 
    id_tipo INT,
    FOREIGN KEY(id_cuenta) REFERENCES cuenta (id)
    ON DELETE CASCADE ON UPDATE CASCADE, 
    FOREIGN KEY(id_tipo) REFERENCES tipo(id)
    ON DELETE CASCADE ON UPDATE CASCADE
);
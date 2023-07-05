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

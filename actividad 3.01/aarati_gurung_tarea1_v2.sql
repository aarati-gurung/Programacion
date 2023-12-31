create schema if not exists tarea1;
use tarea1;

CREATE TABLE IF NOT EXISTS LOCALIDAD(
COD_LOCALIDAD int PRIMARY KEY,
NOMBRE varchar(20)
);

CREATE TABLE IF NOT EXISTS restaurante(
COD_REST int PRIMARY KEY,
NOMBRE varchar(20),
LICENCIA_FISCAL char(9),
DOMICILIO varchar(20),
FECHA_APERTURA date,
HORARIO time,
COD_LOCALIDAD int,
CONSTRAINT FK_COD_LOCALIDAD foreign key (COD_LOCALIDAD) REFERENCES LOCALIDAD(COD_LOCALIDAD)
);

CREATE TABLE IF NOT EXISTS TITULAR (
DNI_TITULAR int PRIMARY KEY,
NOMBRE varchar(20),
DOMICILIO varchar(20),
COD_REST int,
CONSTRAINT FK_COD_REST FOREIGN KEY (COD_REST) REFERENCES RESTAURANTE(COD_REST)
);

CREATE TABLE IF NOT EXISTS EMPLEADO(
DNI_EMPLEADO char(9) PRIMARY KEY,
NOMBRE varchar(20),
DOMICILIO varchar(20)
);

CREATE TABLE IF NOT EXISTS EXISTENCIAS (
COD_ARTICULO int PRIMARY KEY,
NOMBRE varchar(20),
CANTIDAD int,
PRECIO int,
COD_REST int,
CONSTRAINT FK_COD_REST1 FOREIGN KEY (COD_REST) REFERENCES RESTAURANTE(COD_REST)
);

CREATE TABLE IF NOT EXISTS REST_EMPLEADO(
COD_REST int,
DNI_EMPLEADO char(9),
FUNCION varchar(20),
PRIMARY KEY (COD_REST, DNI_EMPLEADO, FUNCION),
CONSTRAINT FK_COD_REST2 FOREIGN KEY (COD_REST) REFERENCES RESTAURANTE(COD_REST)
);

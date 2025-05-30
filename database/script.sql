CREATE DATABASE IF NOT EXISTS cine_db;
USE cine_db;

CREATE TABLE IF NOT EXISTS Usuario (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(100) UNIQUE NOT NULL,
    contrasena VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS Pelicula (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    duracion INT NOT NULL,
    clasificacion VARCHAR(10) NOT NULL
);

CREATE TABLE IF NOT EXISTS Funcion (
    id INT PRIMARY KEY AUTO_INCREMENT,
    idPelicula INT NOT NULL,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    FOREIGN KEY (idPelicula) REFERENCES Pelicula(id)
);

CREATE TABLE IF NOT EXISTS Asiento (
    id INT PRIMARY KEY AUTO_INCREMENT,
    numero VARCHAR(10) NOT NULL,
    ocupado BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE IF NOT EXISTS Boleto (
    id INT PRIMARY KEY AUTO_INCREMENT,
    idFuncion INT NOT NULL,
    idAsiento INT NOT NULL,
    idUsuario INT NOT NULL,
    precio DOUBLE NOT NULL,
    FOREIGN KEY (idFuncion) REFERENCES Funcion(id),
    FOREIGN KEY (idAsiento) REFERENCES Asiento(id),
    FOREIGN KEY (idUsuario) REFERENCES Usuario(id)
);
